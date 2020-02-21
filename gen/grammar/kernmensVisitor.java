// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmens.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kernmensParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kernmensVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link kernmensParser#incipit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncipit(kernmensParser.IncipitContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#mastercleff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMastercleff(kernmensParser.MastercleffContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#keysignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeysignature(kernmensParser.KeysignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#note_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_signature(kernmensParser.Note_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#notesuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotesuffix(kernmensParser.NotesuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(kernmensParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#stem_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStem_direction(kernmensParser.Stem_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#mens_notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMens_notation(kernmensParser.Mens_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_timesignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_timesignature(kernmensParser.M_timesignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_musicalcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_musicalcontent(kernmensParser.M_musicalcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_measure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_measure(kernmensParser.M_measureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_items(kernmensParser.M_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_item(kernmensParser.M_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_note(kernmensParser.M_noteContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_barlines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_barlines(kernmensParser.M_barlinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_rest(kernmensParser.M_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_slurs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_slurs(kernmensParser.M_slursContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_ligature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_ligature(kernmensParser.M_ligatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_dot(kernmensParser.M_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_notesuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_notesuffix(kernmensParser.M_notesuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#mensural_signs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensural_signs(kernmensParser.Mensural_signsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_perfect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_perfect(kernmensParser.M_perfectContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#m_imperfect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_imperfect(kernmensParser.M_imperfectContext ctx);
}