package Visitor;

import org.w3c.dom.Document;

import java.util.HashMap;

/**
 * Created by andy on 1/31/17.
 */

public class EvalVisitor {
    private Document tree;
   private HashMap<String, DomParser> parserTree;
   public EvalVisitor(){
       parserTree = new HashMap<String, DomParser>()
       tree = null;
       this.tree = tree;
   }



}
