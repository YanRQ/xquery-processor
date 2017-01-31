import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import javax.xml.parsers.*;
import java.io.*;
import org.antlr.v4.runtime.*;

public class EvalVistor extends XQueryBaseVisitor<ArrayList<Node>> {

    private Stack<ArrayList<Node>> stack;
    private Document tree;

    public EvalVistor() {
        stack=new Stack<ArrayList<Node>>();

    }

    private ArrayList<Node> descendent_or_self(Node n) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Stack<Node> dfs_stack = new Stack<Node>();

        dfs_stack.push(n);

        while (!dfs_stack.empty()) {
            Node top_node = dfs_stack.pop();
            nodes.add(top_node);
            NodeList children = top_node.getChildNodes();
            for (int i=0; i<children.getLength(); ++i) {
                dfs_stack.push(children.item(i));
            }
        }

        return nodes;
    }

    @Override
    public ArrayList<Node> visitApslash(XQueryParser.ApslashContext ctx) {
        String filename = ctx.file.getText();

        try {
            Document newdoc= DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
            tree = newdoc;
            ArrayList<Node> root = new ArrayList<Node>();
            root.add(tree.getDocumentElement().getParentNode());
            stack.push(root);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitApdoubleslash(XQueryParser.ApdoubleslashContext ctx) {
        String filename = ctx.file.getText();

        try {
            Document newdoc= DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
            tree = newdoc;
            stack.push(descendent_or_self(tree.getDocumentElement().getParentNode()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitRpparen(XQueryParser.RpparenContext ctx) {
        return visit(ctx.rp());
    }

    public ArrayList<Node> visitRpself(XQueryParser.RpselfContext ctx) {
        return stack.pop();
    }

    public ArrayList<Node> visitRpparent(XQueryParser.RpparentContext ctx){
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();

        for (int i=0; i<current_Node.size(); ++i) {
            result.add(current_Node.get(i).getParentNode());
        }

        // need unique
        return result;

    }

    @Override
    public ArrayList<Node> visitRptext(XQueryParser.RptextContext ctx){
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();

        for (int i=0; i<current_Node.size(); ++i) {
            NodeList children = current_Node.get(i).getChildNodes();
            for (int j=0; j<children.getLength(); ++j) {
                if (children.item(j) instanceof Text)
                    result.add(children.item(j));
            }
        }

        return result;
    }
    @Override
    public ArrayList<Node> visitRpslash(XQueryParser.RpslashContext ctx) {
        ArrayList<Node> current_Node=visit(ctx.leftrp);
        stack.push(current_Node);
        return visit(ctx.rightrp);
    }
    @Override
    public ArrayList<Node> visitRpdoubleslash(XQueryParser.RpdoubleslashContext ctx) {
        ArrayList<Node> current_Node = visit(ctx.leftrp);
        ArrayList<Node> all = new ArrayList<Node>();
        for (int i=0; i<current_Node.size(); ++i) {
            all.addAll(descendent_or_self(current_Node.get(i)));
        }
        // TODO: get unique
        stack.push(all);
        return visit(ctx.rightrp);
    }
    @Override
    public ArrayList<Node> visitRpchild(XQueryParser.RpchildContext ctx) {
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();
        for (int i=0; i<current_Node.size(); ++i) {
            NodeList children = current_Node.get(i).getChildNodes();
            for (int j=0; j<children.getLength(); ++j) {
                if (children.item(j) instanceof Element)
                    result.add(children.item(j));
            }
        }
        return result;
    }
    @Override
    public ArrayList<Node> visitRptag(XQueryParser.RptagContext ctx) {
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();

        for (int i=0; i<current_Node.size(); ++i) {
            NodeList children = current_Node.get(i).getChildNodes();
            for (int j=0; j<children.getLength(); ++j) {
                Node node = children.item(j);
                if (node instanceof Element) {
                    Element child = (Element) node;
                    if (child.getNodeName().equals(ctx.name.getText()))
                        //debug
                        //System.out.println(node.getFirstChild().getTextContent());
                        result.add(node);
                }
            }
        }

        return result;
    }
    @Override
    public ArrayList<Node> visitRpcancat(XQueryParser.RpcancatContext ctx) {
        ArrayList<Node> current_Node = stack.peek();
        ArrayList<Node> result = visit(ctx.leftrp);

        // get the original status
        stack.push(current_Node);
        // TODO: not sure about the addall function
        result.addAll(visit(ctx.rightrp));
        return result;
    }
    @Override
    public ArrayList<Node> visitRpfilter(XQueryParser.RpfilterContext ctx) {
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();

        for (int i=0; i<current_Node.size(); ++i) {
            ArrayList<Node> temp = new ArrayList<Node>();
            temp.add(current_Node.get(i));
            stack.push(temp);
            if (visit(ctx.f()).size() > 0)
                result.add(current_Node.get(i));
        }
        return result;
    }
    @Override
    public ArrayList<Node> visitRpattr(XQueryParser.RpattrContext ctx){
        ArrayList<Node> current_Node=stack.pop();
        ArrayList<Node> result=new ArrayList<Node>();
        for(int i=0;i<current_Node.size();i++){
            if (current_Node.get(i).hasAttributes()){
                Node n=current_Node.get(i).getAttributes().getNamedItem(ctx.name.getText());
                if (n!=null){
                    result.add(n);
                }
            }
        }
        return result;

    }
    @Override
    public ArrayList<Node> visitFltor(XQueryParser.FltorContext ctx) {
        ArrayList<Node> current_Node = stack.peek();
        Set<Node> result = new HashSet<Node>();

        ArrayList<Node> temp1 = visit(ctx.leftf);
        stack.push(current_Node);
        ArrayList<Node> temp2 = visit(ctx.rightf);
        result.addAll(temp1);
        result.addAll(temp2);
        return new ArrayList<Node>(result);
    }

    //empty function
    @Override
    public ArrayList<Node> visitFltnot(XQueryParser.FltnotContext ctx) {
        ArrayList<Node> result = new ArrayList<Node>();
        return result;
    }

    //empty function
    @Override
    public ArrayList<Node> visitFltrpeq(XQueryParser.FltrpeqContext ctx){
        ArrayList<Node> result = new ArrayList<Node>();
        return result;
    }

    //empty function
    @Override
    public ArrayList<Node> visitFltrpvaleq(XQueryParser.FltrpvaleqContext ctx){
        ArrayList<Node> result = new ArrayList<Node>();
        return result;
    }

    @Override
    public ArrayList<Node> visitFltrp(XQueryParser.FltrpContext ctx) {
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitFltparen(XQueryParser.FltparenContext ctx) {
        return visit(ctx.f());
    }

    @Override
    public ArrayList<Node> visitFltand(XQueryParser.FltandContext ctx) {
        ArrayList<Node> current_Node = stack.peek();
        ArrayList<Node> result = new ArrayList<Node>();

        ArrayList<Node> temp1 = visit(ctx.leftf);
        stack.push(current_Node);
        ArrayList<Node> temp2 = visit(ctx.rightf);
        for (Node node : temp1) {
            if(temp2.contains(node)) {
                result.add(node);
            }
        }
        return result;
    }

}