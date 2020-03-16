lexer grammar lexerkernmens;


// ESPACIOS Y DEM'AS (CAMBIO?)
WS  :   (' '|'\r'|'\n'|'\t') -> skip;




/*  TOKENS  */


LETTER_L:'L';
//COMMON:'c';

LETTER_M:'M';
PERTFECT:'o' | 'O';
DIGIT:[0-9];
THREE: '3';
TWO: '2';



SHARP: '#';
FLAT:'-';
DOUBLESHARP: '##';
DOUBLEFLAT: '--';
NATURAL: 'n';

CLEF: ('G2'|'F2'|'F3'|'F4'|'C5'|'C4'|'C3'|'C2'|'C1'|'G1'|'Gv2');

SPACE:' ';
GREATER:'>';
LESS:'<';

LEFTPAR:'(';
RIGHTPAR:')';
LEFTBRACKET: '[';
RIGHTBRACKET: ']';
LEFTCURBRACES: '{';
RIGHTCURBRACES: '}';

LETTER_K:'K';
LETTER_k:'k';
LETTER_S: 'S';
LETTER_s: 's';
LETTER_u:'u';
LETTER_m:'m';
LETTER_T:'T';
LETTER_t:'t';
LETTER_W:'W';
LETTER_w:'w';
LETTER_U:'U';
LETTER_p:'p';
LETTER_i:'i';
LETTER_v:'v';
LETTER_r:'r';
LETTER_R:'R';
LETTER_I:'I';
LETTER_P:'P';
// NOTES
LETTER_A:'A';
LETTER_B:'B';
LETTER_C:'C';
LETTER_D:'D';
LETTER_E:'E';
LETTER_F:'F';
LETTER_G:'G';
LETTER_X: 'X';

LETTER_a:'a';
LETTER_b:'b';
LETTER_c:'c';
LETTER_d:'d';
LETTER_e:'e';
LETTER_f:'f';
LETTER_g:'g';


LETTER_J:'J';


WORD_CLEF:'clef';
WORD_SKERN: 'skern';
WORD_SMENS:'smens';
WORD_MET:'met';


DOT:'.';
BARLINE:'|';
EQUAL:'=';
SLASH:'/';
BACKSLASH:'\\';
ASTERISK: '*';
CIRCUNFLEX: '^';
APOSTROPHE:'\'';
SEMICOLON:';';
COLON:':';
COLOURED: '~';
GRAVE_ACCENT:'`';
EXCLAMATION:'!';
COMA:',';
SLURS_COUNT:'&';
TOKEN_FINISH:'*-';