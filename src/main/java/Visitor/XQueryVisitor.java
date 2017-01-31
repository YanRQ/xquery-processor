// Generated from XQuery.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code apslash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApslash(XQueryParser.ApslashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apdoubleslash}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApdoubleslash(XQueryParser.ApdoubleslashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpparen}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpparen(XQueryParser.RpparenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpself}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpself(XQueryParser.RpselfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpparent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpparent(XQueryParser.RpparentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rptext}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRptext(XQueryParser.RptextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpslash(XQueryParser.RpslashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpdoubleslash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpdoubleslash(XQueryParser.RpdoubleslashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rptag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRptag(XQueryParser.RptagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpchild}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpchild(XQueryParser.RpchildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpcancat}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpcancat(XQueryParser.RpcancatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpfilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpfilter(XQueryParser.RpfilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpattr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpattr(XQueryParser.RpattrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltor}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltor(XQueryParser.FltorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltnot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltnot(XQueryParser.FltnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltrpeq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltrpeq(XQueryParser.FltrpeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltrpvaleq}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltrpvaleq(XQueryParser.FltrpvaleqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltrp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltrp(XQueryParser.FltrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltparen}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltparen(XQueryParser.FltparenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fltand}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltand(XQueryParser.FltandContext ctx);
}