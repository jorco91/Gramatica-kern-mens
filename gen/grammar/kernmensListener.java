// Generated from /Users/jorgemarcoesteve/IdeaProjects/TFG/src/main/java/grammar/kernmens.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kernmensParser}.
 */
public interface kernmensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kernmensParser#incipit}.
	 * @param ctx the parse tree
	 */
	void enterIncipit(kernmensParser.IncipitContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#incipit}.
	 * @param ctx the parse tree
	 */
	void exitIncipit(kernmensParser.IncipitContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#mastercleff}.
	 * @param ctx the parse tree
	 */
	void enterMastercleff(kernmensParser.MastercleffContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#mastercleff}.
	 * @param ctx the parse tree
	 */
	void exitMastercleff(kernmensParser.MastercleffContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#keysignature}.
	 * @param ctx the parse tree
	 */
	void enterKeysignature(kernmensParser.KeysignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#keysignature}.
	 * @param ctx the parse tree
	 */
	void exitKeysignature(kernmensParser.KeysignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#note_signature}.
	 * @param ctx the parse tree
	 */
	void enterNote_signature(kernmensParser.Note_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#note_signature}.
	 * @param ctx the parse tree
	 */
	void exitNote_signature(kernmensParser.Note_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#notesuffix}.
	 * @param ctx the parse tree
	 */
	void enterNotesuffix(kernmensParser.NotesuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#notesuffix}.
	 * @param ctx the parse tree
	 */
	void exitNotesuffix(kernmensParser.NotesuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(kernmensParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(kernmensParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#stem_direction}.
	 * @param ctx the parse tree
	 */
	void enterStem_direction(kernmensParser.Stem_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#stem_direction}.
	 * @param ctx the parse tree
	 */
	void exitStem_direction(kernmensParser.Stem_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#mens_notation}.
	 * @param ctx the parse tree
	 */
	void enterMens_notation(kernmensParser.Mens_notationContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#mens_notation}.
	 * @param ctx the parse tree
	 */
	void exitMens_notation(kernmensParser.Mens_notationContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_timesignature}.
	 * @param ctx the parse tree
	 */
	void enterM_timesignature(kernmensParser.M_timesignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_timesignature}.
	 * @param ctx the parse tree
	 */
	void exitM_timesignature(kernmensParser.M_timesignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_musicalcontent}.
	 * @param ctx the parse tree
	 */
	void enterM_musicalcontent(kernmensParser.M_musicalcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_musicalcontent}.
	 * @param ctx the parse tree
	 */
	void exitM_musicalcontent(kernmensParser.M_musicalcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_measure}.
	 * @param ctx the parse tree
	 */
	void enterM_measure(kernmensParser.M_measureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_measure}.
	 * @param ctx the parse tree
	 */
	void exitM_measure(kernmensParser.M_measureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_items}.
	 * @param ctx the parse tree
	 */
	void enterM_items(kernmensParser.M_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_items}.
	 * @param ctx the parse tree
	 */
	void exitM_items(kernmensParser.M_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_item}.
	 * @param ctx the parse tree
	 */
	void enterM_item(kernmensParser.M_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_item}.
	 * @param ctx the parse tree
	 */
	void exitM_item(kernmensParser.M_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_note}.
	 * @param ctx the parse tree
	 */
	void enterM_note(kernmensParser.M_noteContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_note}.
	 * @param ctx the parse tree
	 */
	void exitM_note(kernmensParser.M_noteContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_barlines}.
	 * @param ctx the parse tree
	 */
	void enterM_barlines(kernmensParser.M_barlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_barlines}.
	 * @param ctx the parse tree
	 */
	void exitM_barlines(kernmensParser.M_barlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_rest}.
	 * @param ctx the parse tree
	 */
	void enterM_rest(kernmensParser.M_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_rest}.
	 * @param ctx the parse tree
	 */
	void exitM_rest(kernmensParser.M_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_slurs}.
	 * @param ctx the parse tree
	 */
	void enterM_slurs(kernmensParser.M_slursContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_slurs}.
	 * @param ctx the parse tree
	 */
	void exitM_slurs(kernmensParser.M_slursContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_ligature}.
	 * @param ctx the parse tree
	 */
	void enterM_ligature(kernmensParser.M_ligatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_ligature}.
	 * @param ctx the parse tree
	 */
	void exitM_ligature(kernmensParser.M_ligatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_dot}.
	 * @param ctx the parse tree
	 */
	void enterM_dot(kernmensParser.M_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_dot}.
	 * @param ctx the parse tree
	 */
	void exitM_dot(kernmensParser.M_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_notesuffix}.
	 * @param ctx the parse tree
	 */
	void enterM_notesuffix(kernmensParser.M_notesuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_notesuffix}.
	 * @param ctx the parse tree
	 */
	void exitM_notesuffix(kernmensParser.M_notesuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#mensural_signs}.
	 * @param ctx the parse tree
	 */
	void enterMensural_signs(kernmensParser.Mensural_signsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#mensural_signs}.
	 * @param ctx the parse tree
	 */
	void exitMensural_signs(kernmensParser.Mensural_signsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_perfect}.
	 * @param ctx the parse tree
	 */
	void enterM_perfect(kernmensParser.M_perfectContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_perfect}.
	 * @param ctx the parse tree
	 */
	void exitM_perfect(kernmensParser.M_perfectContext ctx);
	/**
	 * Enter a parse tree produced by {@link kernmensParser#m_imperfect}.
	 * @param ctx the parse tree
	 */
	void enterM_imperfect(kernmensParser.M_imperfectContext ctx);
	/**
	 * Exit a parse tree produced by {@link kernmensParser#m_imperfect}.
	 * @param ctx the parse tree
	 */
	void exitM_imperfect(kernmensParser.M_imperfectContext ctx);
}