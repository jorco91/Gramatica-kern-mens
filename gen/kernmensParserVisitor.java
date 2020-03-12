// Generated from /Users/jorgemarco/IdeaProjects/ProyectoTFG/src/main/antlr4/jorge/kernmensParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kernmensParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kernmensParserVisitor<T> extends ParseTreeVisitor<T> {
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
	 * Visit a parse tree produced by {@link kernmensParser#kern_notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKern_notation(kernmensParser.Kern_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#timesignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesignature(kernmensParser.TimesignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(kernmensParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(kernmensParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#metter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetter(kernmensParser.MetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#common_met}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_met(kernmensParser.Common_metContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#perfect_met}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerfect_met(kernmensParser.Perfect_metContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#musicalcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMusicalcontent(kernmensParser.MusicalcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#measure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure(kernmensParser.MeasureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(kernmensParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(kernmensParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#changeconfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeconfiguration(kernmensParser.ChangeconfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#slurs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlurs(kernmensParser.SlursContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#ties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTies(kernmensParser.TiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#notesties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotesties(kernmensParser.NotestiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#tiesaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiesaux(kernmensParser.TiesauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#notes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotes(kernmensParser.NotesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#beaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeaming(kernmensParser.BeamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(kernmensParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(kernmensParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(kernmensParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#barlines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarlines(kernmensParser.BarlinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord(kernmensParser.ChordContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#articulations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticulations(kernmensParser.ArticulationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#ornaments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrnaments(kernmensParser.OrnamentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#partial_beaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_beaming(kernmensParser.Partial_beamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#doubleBarline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleBarline(kernmensParser.DoubleBarlineContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link kernmensParser#noteName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteName(kernmensParser.NoteNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link kernmensParser#noteNameCl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteNameCl(kernmensParser.NoteNameClContext ctx);
}