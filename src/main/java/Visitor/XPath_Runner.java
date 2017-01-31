import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.*;
import java.util.*;
import java.io.*;

public class XPath_Runner{
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        BufferedReader br = null ;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(args[0]));
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
        } finally {
            br.close();
        }

        ANTLRInputStream input = new ANTLRInputStream(sb.toString());

        // create a lexer that feeds off of input CharStream
        XQueryLexer lexer = new XQueryLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XQueryParser parser=new XQueryParser(tokens);

        ParseTree tree = parser.ap();

        //String filename="";
        //DomTree domtree=new DomTree(filename);

        EvalVistor eval = new EvalVistor();

        ArrayList<Node> result;
        //if (eval.visit(tree)!=null)
        result = eval.visit(tree);
        //Utils.printInDocOrder(result);
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8"));
            //writer.write(Utils.printNodes(result));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }

    }
}
