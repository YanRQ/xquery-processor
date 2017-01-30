import org.w3c.dom.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import javax.xml.parsers.*;
import java.io.*;
import org.antlr.v4.runtime.*;

public class EvalVistor implements XQueryBaseListener {

    private ArrayList<Node> stack;
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

    ArrayList<Node> visitXqap(XQueryParser.XqapContext ctx) {
        return visit(ctx.ap())
    }

    T visitXqtag(XQueryParser.XqtagContext ctx){

    }

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
            root = tree.getDocumentElement().getParentNode();
            stack = descendent_or_self(root)
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }


    ArrayList<Node> visitApdoubleslash(XQueryParser.ApdoubleslashContext ctx) {
        String filename = ctx.StringLiteral.getText();

        try {
            Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
            tree = newdoc;
            root = tree.getDocumentElement().getParentNode();
            stack.push(root);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return visit(ctx.rp());
    }

    T visitRpparen(XQueryParser.RpparenContext ctx);

    T visitRpself(XQueryParser.RpselfContext ctx);

    T visitRpparent(XQueryParser.RpparentContext ctx);

    T visitRptext(XQueryParser.RptextContext ctx);

    T visitRpslash(XQueryParser.RpslashContext ctx);

    T visitRpdoubleslash(XQueryParser.RpdoubleslashContext ctx);

    T visitRpchild(XQueryParser.RpchildContext ctx);

    T visitRpstring(XQueryParser.RpstringContext ctx);

    T visitRpcancat(XQueryParser.RpcancatContext ctx);

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