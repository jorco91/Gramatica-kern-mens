parser grammar kernmensParser;
options {tokenVocab=lexerkernmens;}


///////////////////////////////////////////////////////////////
/*                            RULES                          */
///////////////////////////////////////////////////////////////
incipit: kern_notation+ | mens_notation+;





/* SAME RULES TO KERN AND MENSURAL */
mastercleff:ASTERISK WORD_CLEF CLEF;
keysignature:ASTERISK LETTER_k LEFTBRACKET note_signature (COMA note_signature)* RIGHTBRACKET;
note_signature: noteName (FLAT | SHARP);
notesuffix:SHARP | DOUBLESHARP | FLAT | DOUBLEFLAT | NATURAL;
pitch: noteName+ | noteNameCl+;
stem_direction:SLASH | BACKSLASH;

/*              NOTATION KERN               */
kern_notation:ASTERISK ASTERISK WORD_SKERN mastercleff keysignature? timesignature musicalcontent TOKEN_FINISH;
timesignature:ASTERISK LETTER_M fraction (metter)?;
fraction:number SLASH number;
number: DIGIT+;
metter:ASTERISK WORD_MET LEFTPAR (common_met | perfect_met) RIGHTPAR;
common_met:LETTER_c|LETTER_C (BARLINE | DOT | LETTER_R)?; //COJE NOTENATE EN VEZ DE LETTER_c
perfect_met: PERTFECT (BARLINE | DOT)?;
musicalcontent:barlines? measure+ | items;
measure: items barlines;
items: item+;
item: notes | rest | changeconfiguration | slurs | ties;
changeconfiguration:(mastercleff | timesignature | keysignature)+;
slurs: LETTER_U? SLURS_COUNT* LEFTPAR | SLURS_COUNT* RIGHTPAR;
ties:LETTER_U? LEFTBRACKET notes barlines? notesties;
notesties: tiesaux | barlines? notes RIGHTBRACKET;
tiesaux: LETTER_U? LEFTBRACKET notes RIGHTBRACKET barlines? notesties;
notes: beaming |note |chord  ;
beaming:LETTER_L+ (note | chord)| (note | chord) LETTER_J+ | (note | chord) partial_beaming;     ///  CAMBIADO POR RECURSIVIDAD 'INVALIDA'
note: time DOT* pitch notesuffix? ornaments? articulations? stem_direction?;
time: DIGIT+;
rest: time LETTER_r;
barlines:EQUAL DIGIT*| BARLINE BARLINE| EXCLAMATION BARLINE COLON | COLON BARLINE EXCLAMATION | EQUAL EQUAL;
chord:note (COMA note)+;
articulations: APOSTROPHE | CIRCUNFLEX | GRAVE_ACCENT | COLOURED | APOSTROPHE COLOURED| APOSTROPHE CIRCUNFLEX| CIRCUNFLEX CIRCUNFLEX| SEMICOLON;
ornaments: LETTER_t | LETTER_T |LETTER_m | LETTER_M | LETTER_W | LETTER_w;
partial_beaming:LETTER_K |LETTER_k;





/*              NOTATION MENSURAL           */
mens_notation: ASTERISK ASTERISK WORD_SMENS mastercleff m_timesignature? keysignature? m_musicalcontent TOKEN_FINISH;
m_timesignature: ASTERISK WORD_MET LEFTPAR mensural_signs RIGHTPAR;

m_musicalcontent: m_measure+ | m_items;
m_measure: m_items | m_barlines;
m_items: m_item+;
m_item: m_note | m_rest | m_slurs | m_ligature;
m_note: M_RHYTHM m_dot? (m_perfect | m_imperfect)? COLOURED? pitch m_notesuffix? stem_direction?;
m_barlines: EQUAL FLAT | EQUAL BARLINE BARLINE;
m_rest: M_RHYTHM LETTER_r;
m_slurs: LEFTPAR | RIGHTPAR;
m_ligature: LESS | GREATER;
m_dot: LETTER_p COLON;
m_notesuffix: LETTER_U? notesuffix;
mensural_signs: (LETTER_c (BARLINE (THREE | TWO | SLASH (TWO | THREE) | LETTER_r)? | TWO | THREE | DOT (BARLINE)? | LETTER_r)?) | (PERTFECT (TWO | THREE | BARLINE (THREE)? | SLASH THREE | DOT)? | THREE SLASH TWO | THREE | TWO);
m_perfect: LETTER_p;
m_imperfect: LETTER_i;


noteName:(LETTER_a | LETTER_b | LETTER_c | LETTER_d | LETTER_e | LETTER_f | LETTER_g);
noteNameCl:(LETTER_A | LETTER_B | LETTER_C | LETTER_D | LETTER_E | LETTER_F | LETTER_G);

