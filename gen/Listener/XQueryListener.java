// Generated from /Users/richard/Documents/graduate study/2nd semester/CS232B/project/xquery/src/main/java/Listener/XQuery.g4 by ANTLR 4.6
package Listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code xqap}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqap(XQueryParser.XqapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqap}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqap(XQueryParser.XqapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqtag}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqtag(XQueryParser.XqtagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqtag}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqtag(XQueryParser.XqtagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqconcat}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqconcat(XQueryParser.XqconcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqconcat}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqconcat(XQueryParser.XqconcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqlet}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqlet(XQueryParser.XqletContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqlet}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqlet(XQueryParser.XqletContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqslash}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqslash(XQueryParser.XqslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqslash}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqslash(XQueryParser.XqslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqclause}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqclause(XQueryParser.XqclauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqclause}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqclause(XQueryParser.XqclauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqparen}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqparen(XQueryParser.XqparenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqparen}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqparen(XQueryParser.XqparenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqstring}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqstring(XQueryParser.XqstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqstring}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqstring(XQueryParser.XqstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqdoubleslash}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqdoubleslash(XQueryParser.XqdoubleslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqdoubleslash}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqdoubleslash(XQueryParser.XqdoubleslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqvar}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterXqvar(XQueryParser.XqvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqvar}
	 * labeled alternative in {@link XQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitXqvar(XQueryParser.XqvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XQueryParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XQueryParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpparen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpparen(XQueryParser.RpparenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpparen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpparen(XQueryParser.RpparenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpself}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpself(XQueryParser.RpselfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpself}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpself(XQueryParser.RpselfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpparent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpparent(XQueryParser.RpparentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpparent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpparent(XQueryParser.RpparentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rptext}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRptext(XQueryParser.RptextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rptext}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRptext(XQueryParser.RptextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpslash(XQueryParser.RpslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpslash(XQueryParser.RpslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpdoubleslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpdoubleslash(XQueryParser.RpdoubleslashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpdoubleslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpdoubleslash(XQueryParser.RpdoubleslashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpchild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpchild(XQueryParser.RpchildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpchild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpchild(XQueryParser.RpchildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpstring}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpstring(XQueryParser.RpstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpstring}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpstring(XQueryParser.RpstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpcancat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpcancat(XQueryParser.RpcancatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpcancat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpcancat(XQueryParser.RpcancatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpfilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpfilter(XQueryParser.RpfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpfilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpfilter(XQueryParser.RpfilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpattr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpattr(XQueryParser.RpattrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpattr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpattr(XQueryParser.RpattrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltor}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltor(XQueryParser.FltorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltor}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltor(XQueryParser.FltorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltnot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltnot(XQueryParser.FltnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltnot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltnot(XQueryParser.FltnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltrpeq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltrpeq(XQueryParser.FltrpeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltrpeq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltrpeq(XQueryParser.FltrpeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltrpvaleq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltrpvaleq(XQueryParser.FltrpvaleqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltrpvaleq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltrpvaleq(XQueryParser.FltrpvaleqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltrp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltrp(XQueryParser.FltrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltrp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltrp(XQueryParser.FltrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltparen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltparen(XQueryParser.FltparenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltparen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltparen(XQueryParser.FltparenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fltand}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFltand(XQueryParser.FltandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fltand}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFltand(XQueryParser.FltandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condeq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondeq(XQueryParser.CondeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condeq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondeq(XQueryParser.CondeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condnot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondnot(XQueryParser.CondnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condnot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondnot(XQueryParser.CondnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condvaleq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondvaleq(XQueryParser.CondvaleqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condvaleq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondvaleq(XQueryParser.CondvaleqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condempty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondempty(XQueryParser.CondemptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condempty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondempty(XQueryParser.CondemptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condexist}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondexist(XQueryParser.CondexistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condexist}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondexist(XQueryParser.CondexistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condand}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondand(XQueryParser.CondandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condand}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondand(XQueryParser.CondandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condor}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondor(XQueryParser.CondorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condor}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondor(XQueryParser.CondorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condparen}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondparen(XQueryParser.CondparenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condparen}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondparen(XQueryParser.CondparenContext ctx);
}