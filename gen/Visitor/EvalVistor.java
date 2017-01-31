import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import javax.xml.parsers.*;
import java.io.*;
import org.antlr.v4.runtime.*;

public class EvalVistor implements XQueryBaseListener {

    private Stack<ArrayList<Node>> stack;
    private Document tree;
    public EvalVistor() {
        stack=new ArrayList<Node>();

    }

    private ArrayList<Node> descendent_or_self(Node n) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        Stack<Node> dfs_stack = new Stack<Node>();

        dfs_stack.push(n);

        while (!dfs_stack.empty()) {
            Node top_node = dfs.pop();
            nodes.add(top_nodes);
            NodeList children = node.getChildrenNodes();
            for (int i=0; i<children.getLength(); ++i) {
                dfs_stack.push(children.item(i));
            }
        }

        return nodes;
    }

    ArrayList<Node> visitXqap(XQueryParser.XqapContext ctx);

    T visitXqtag(XQueryParser.XqtagContext ctx);

    T visitXqconcat(XQueryParser.XqconcatContext ctx);

    T visitXqlet(XQueryParser.XqletContext ctx);

    T visitXqslash(XQueryParser.XqslashContext ctx);

    T visitXqclause(XQueryParser.XqclauseContext ctx);

    T visitXqparen(XQueryParser.XqparenContext ctx);

    T visitXqstring(XQueryParser.XqstringContext ctx);

    T visitXqdoubleslash(XQueryParser.XqdoubleslashContext ctx);

    T visitXqvar(XQueryParser.XqvarContext ctx);

    T visitForClause(XQueryParser.ForClauseContext ctx);

    T visitLetClause(XQueryParser.LetClauseContext ctx);

    T visitWhereClause(XQueryParser.WhereClauseContext ctx);

    T visitReturnClause(XQueryParser.ReturnClauseContext ctx);

    ArrayList<Node> visitApslash(XQueryParser.ApslashContext ctx) {
        String filename = ctx.StringLiteral.getText();

        try {
            Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
            tree = newdoc;
            ArrayList<Node> root = new ArrayList<Node>();
            root.add(tree.getDocumentElement().getParentNode());
            stack.push(root)
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }


    public ArrayList<Node> visitApdoubleslash(XQueryParser.ApdoubleslashContext ctx) {
        String filename = ctx.StringLiteral.getText();

        try {
            Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
            tree = newdoc;
            stack.push(descendent_or_self(tree.getDocumentElement().getParentNode()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }

    public ArrayList<Node> visitRpparen(XQueryParser.RpparenContext ctx) {
        return visit(ctx.rp())
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

        return Utils.getUnique(result);

    }

    public ArrayList<Node> visitRptext(XQueryParser.RptextContext ctx){
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();

        for (i=0; i<current_Node.size(); ++i) {
            NodeList children = current_Node.get(i).getChildNodes();
            for (j=0; j<children.getLength(); ++j) {
                if (children.item(j) instanceof Text)
                    result.add(children.item(j))
            }
        }

        return result
    }

    public ArrayList<Node> visitRpslash(XQueryParser.RpslashContext ctx) {
        ArrayList<Node> current_Node=visit(ctx.leftrp());
        stack.push(current_Node);
        return visit(ctx.rightrp())
    }

    public ArrayList<Node> visitRpdoubleslash(XQueryParser.RpdoubleslashContext ctx) {
        ArrayList<Node> current_Node = visit(ctx.leftrp());
        ArrayList<Node> all = new ArrayList<Node>();
        for (int i=0; i<current_Node.size(); ++i) {
            all.push(descendent_or_self(current_Node.get(i)))
        }
        all = Utils.getUnique(all);
        stack.push(all)
        return visit(ctx.rightrp())
    }

    public ArrayList<Node> visitRpchild(XQueryParser.RpchildContext ctx) {
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();
        for (int i=0; i<current_Node.size(); ++i) {
            NodeList Children = current_Node.get(i).getChildNodes()
            for (j=0; j<children.getLength(); ++j) {
                if (children.item(j) instanceof Element)
                    result.add(children.item(j))
            }
        }
        return result;
    }

    public ArrayList<Node> visitRptag(XQueryParser.RptagContext ctx) {
        ArrayList<Node> current_Node = stack.pop();
        ArrayList<Node> result = new ArrayList<Node>();

        for (int i=0; i<current_Node.size(); ++i) {
            if (current_Node.get(i).getTagName().equalsIgnoreCase(ctx.StringConstant))
                result.add(current_Node.get(i))
        }

        return result;
    }

    public ArrayList<Node> visitRpcancat(XQueryParser.RpcancatContext ctx) {
        ArrayList<Node> result = visit(ctx.leftrp());
        // TODO: not sure about the addall function
        result.addAll(visit(ctx.rightrp()));
        return result
    }

    T visitRpfilter(XQueryParser.RpfilterContext ctx);

    T visitRpattr(XQueryParser.RpattrContext ctx);

    T visitFltor(XQueryParser.FltorContext ctx);

    T visitFltnot(XQueryParser.FltnotContext ctx);

    T visitFltrpeq(XQueryParser.FltrpeqContext ctx);

    T visitFltrpvaleq(XQueryParser.FltrpvaleqContext ctx);

    T visitFltrp(XQueryParser.FltrpContext ctx);

    T visitFltparen(XQueryParser.FltparenContext ctx);

    T visitFltand(XQueryParser.FltandContext ctx);

    T visitCondeq(XQueryParser.CondeqContext ctx);

    T visitCondnot(XQueryParser.CondnotContext ctx);

    T visitCondvaleq(XQueryParser.CondvaleqContext ctx);

    T visitCondempty(XQueryParser.CondemptyContext ctx);

    T visitCondexist(XQueryParser.CondexistContext ctx);

    T visitCondand(XQueryParser.CondandContext ctx);

    T visitCondor(XQueryParser.CondorContext ctx);

    T visitCondparen(XQueryParser.CondparenContext ctx);
}