/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

/* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_HtmlLexer.flex</tt>
 */
public class _HtmlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int DOC_TYPE = 2;
  public static final int COMMENT = 4;
  public static final int START_TAG_NAME = 6;
  public static final int END_TAG_NAME = 8;
  public static final int BEFORE_TAG_ATTRIBUTES = 10;
  public static final int TAG_ATTRIBUTES = 12;
  public static final int ATTRIBUTE_VALUE_START = 14;
  public static final int ATTRIBUTE_VALUE_DQ = 16;
  public static final int ATTRIBUTE_VALUE_SQ = 18;
  public static final int PROCESSING_INSTRUCTION = 20;
  public static final int START_TAG_NAME2 = 22;
  public static final int END_TAG_NAME2 = 24;
  public static final int TAG_CHARACTERS = 26;
  public static final int C_COMMENT_START = 28;
  public static final int C_COMMENT_END = 30;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 13504 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\11\1\33\1\34\2\11\1\14\1\35\3\11\1\36\10\11\1\37\1\40\20\11\1\41\2\11"+
    "\1\42\5\11\1\43\4\11\1\44\1\45\4\11\51\14\1\46\3\14\1\47\1\50\4\14\1\51\12"+
    "\11\1\52\u0381\11");

  /* The ZZ_CMAP_Y table has 2752 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\1\1\10\1\11\1\12\1\13\1\12\1\13\34\12\1"+
    "\14\1\15\1\16\10\1\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\23\12\12\1\24\1\12"+
    "\1\25\1\24\1\12\1\26\4\1\1\12\1\27\1\30\2\1\2\12\1\27\1\1\1\31\1\24\5\12\1"+
    "\32\1\33\1\34\1\1\1\35\1\12\1\1\1\36\5\12\1\37\1\40\1\41\1\12\1\27\1\42\1"+
    "\12\1\43\1\44\1\1\1\12\1\45\4\1\1\12\1\46\4\1\1\47\2\12\1\50\1\1\1\51\1\15"+
    "\1\24\1\52\1\53\1\54\1\55\1\56\1\57\2\15\1\60\1\53\1\54\1\61\1\1\1\62\1\1"+
    "\1\63\1\64\1\21\1\54\1\65\1\1\1\66\1\15\1\67\1\70\1\53\1\54\1\65\1\1\1\57"+
    "\1\15\1\40\1\71\1\72\1\73\1\74\1\1\1\66\2\1\1\75\1\35\1\54\1\50\1\1\1\76\1"+
    "\15\1\1\1\75\1\35\1\54\1\77\1\1\1\56\1\15\1\100\1\75\1\35\1\12\1\101\1\56"+
    "\1\102\1\15\1\41\1\103\1\104\1\12\1\105\1\106\3\1\1\24\2\12\1\107\1\106\3"+
    "\1\1\110\1\111\1\112\1\113\1\114\1\115\2\1\1\66\3\1\1\116\1\12\1\117\1\1\1"+
    "\120\7\1\2\12\1\27\1\102\1\1\1\121\1\122\1\123\1\124\1\1\2\12\1\125\2\12\1"+
    "\126\24\12\1\127\1\130\2\12\1\127\2\12\1\131\1\132\1\13\3\12\1\132\3\12\1"+
    "\27\2\1\1\12\1\1\5\12\1\133\1\24\45\12\1\134\1\12\1\24\1\27\4\12\1\27\1\135"+
    "\1\136\1\15\1\12\1\15\1\12\1\15\1\136\1\66\3\12\1\137\1\1\1\140\4\1\5\12\1"+
    "\26\2\12\1\141\4\12\1\37\1\12\1\142\3\1\1\12\1\143\1\46\2\12\1\144\1\12\1"+
    "\74\3\1\1\12\1\106\3\12\1\46\4\1\1\145\5\1\1\103\2\12\1\137\1\146\3\1\1\147"+
    "\1\12\1\150\1\41\2\12\1\37\1\1\2\12\1\137\1\1\1\36\1\41\1\12\1\143\6\1\1\151"+
    "\1\152\14\12\4\1\21\12\1\133\2\12\1\133\1\153\1\12\1\143\3\12\1\154\1\155"+
    "\1\156\1\117\1\155\7\1\1\157\1\1\1\117\6\1\1\160\1\161\1\162\1\163\1\164\3"+
    "\1\1\165\147\1\2\12\1\142\2\12\1\142\10\12\1\166\1\167\2\12\1\125\3\12\1\170"+
    "\1\1\1\12\1\106\4\171\4\1\1\102\35\1\1\172\2\1\1\173\1\24\4\12\1\174\1\24"+
    "\4\12\1\126\1\103\1\12\1\143\1\24\4\12\1\142\1\1\1\12\1\27\3\1\1\12\40\1\133"+
    "\12\1\37\4\1\135\12\1\37\2\1\10\12\1\117\4\1\2\12\1\143\20\12\1\117\1\12\1"+
    "\175\1\1\2\12\1\142\1\102\1\12\1\143\4\12\1\37\2\1\1\176\1\177\5\12\1\200"+
    "\1\12\1\143\1\26\3\1\1\176\1\201\1\12\1\30\1\1\3\12\1\137\1\177\2\12\1\137"+
    "\3\1\1\202\1\41\1\12\1\37\1\12\1\106\1\1\1\12\1\117\1\47\2\12\1\30\1\102\1"+
    "\1\1\203\1\204\2\12\1\45\1\1\1\205\1\1\1\12\1\206\3\12\1\207\1\210\1\211\1"+
    "\27\1\63\1\212\1\213\1\171\2\12\1\126\1\37\7\12\1\30\1\1\72\12\1\137\1\12"+
    "\1\214\2\12\1\144\20\1\26\12\1\143\6\12\1\74\2\1\1\106\1\215\1\54\1\216\1"+
    "\217\6\12\1\15\1\1\1\147\25\12\1\143\1\1\4\12\1\177\2\12\1\26\2\1\1\144\7"+
    "\1\1\203\7\12\1\117\2\1\1\24\1\27\1\24\1\27\1\220\4\12\1\142\1\221\1\222\2"+
    "\1\1\223\1\12\1\13\1\224\2\143\2\1\7\12\1\27\30\1\1\12\1\117\3\12\1\66\2\1"+
    "\2\12\1\1\1\12\1\225\2\12\1\37\1\12\1\143\2\12\1\226\3\1\11\12\1\143\6\1\2"+
    "\12\1\26\3\12\1\137\11\1\23\12\1\106\1\12\1\37\1\26\11\1\1\227\2\12\1\230"+
    "\1\12\1\37\1\12\1\106\1\12\1\142\4\1\1\12\1\231\1\12\1\37\1\12\1\74\4\1\3"+
    "\12\1\232\4\1\1\66\1\233\1\12\1\137\2\1\1\12\1\117\1\12\1\117\2\1\1\116\1"+
    "\12\1\46\1\1\3\12\1\37\1\12\1\37\1\12\1\30\1\12\1\15\6\1\4\12\1\45\3\1\3\12"+
    "\1\30\3\12\1\30\60\1\1\147\2\12\1\26\4\1\1\147\2\12\2\1\1\12\1\45\1\1\1\147"+
    "\1\12\1\106\2\1\2\12\1\234\1\147\2\12\1\30\1\235\1\236\2\1\1\12\1\21\1\144"+
    "\5\1\1\237\1\240\1\45\2\12\1\142\2\1\1\70\1\53\1\54\1\65\1\1\1\241\1\15\21"+
    "\1\3\12\1\1\1\242\13\1\2\12\1\142\2\1\1\243\2\1\3\12\1\1\1\244\3\1\2\12\1"+
    "\27\5\1\1\12\1\74\30\1\4\12\1\1\1\102\34\1\3\12\1\45\20\1\71\12\1\74\16\1"+
    "\14\12\1\137\53\1\2\12\1\142\75\1\44\12\1\106\33\1\43\12\1\45\1\12\1\142\7"+
    "\1\1\12\1\143\1\1\3\12\1\1\1\137\1\1\1\147\1\245\1\12\67\1\4\12\1\46\1\66"+
    "\3\1\1\147\6\1\1\15\77\1\6\12\1\27\1\117\1\45\1\74\66\1\5\12\1\203\3\12\1"+
    "\136\1\246\1\247\1\250\3\12\1\251\1\252\1\12\1\253\1\254\1\35\24\12\1\255"+
    "\1\12\1\35\1\126\1\12\1\126\1\12\1\203\1\12\1\203\1\142\1\12\1\142\1\12\1"+
    "\54\1\12\1\54\1\12\1\205\3\1\14\12\1\46\123\1\1\250\1\12\1\256\1\257\1\260"+
    "\1\261\1\262\1\263\1\264\1\144\1\265\1\144\24\1\55\12\1\106\2\1\103\12\1\46"+
    "\15\12\1\143\150\12\1\15\25\1\41\12\1\143\36\1");

  /* The ZZ_CMAP_A table has 2912 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\2\3\1\0\2\3\22\0\1\3\1\14\1\11\1\7\1\51\1\0\1\43\1\12\2\42\3\0\1\6\1"+
    "\5\1\45\12\2\1\4\1\52\1\13\1\10\1\41\1\44\1\0\1\61\1\36\1\20\1\15\1\26\1\61"+
    "\1\1\1\27\1\40\2\1\1\32\1\30\1\1\1\16\1\24\3\1\1\21\1\34\3\1\1\23\1\1\1\46"+
    "\1\50\1\47\1\0\1\4\1\0\1\54\1\37\1\20\1\15\1\26\1\61\1\53\1\27\1\40\2\1\1"+
    "\33\1\31\1\57\1\17\1\25\1\56\1\1\1\55\1\22\1\35\2\1\1\60\1\23\1\1\1\0\1\42"+
    "\15\0\1\1\12\0\1\1\4\0\1\1\5\0\27\1\1\0\12\1\4\0\14\1\16\0\5\1\7\0\1\1\1\0"+
    "\1\1\1\0\5\1\1\0\2\1\2\0\4\1\1\0\1\1\6\0\1\1\1\0\3\1\1\0\1\1\1\0\4\1\1\0\23"+
    "\1\1\0\13\1\10\0\6\1\1\0\26\1\2\0\1\1\6\0\10\1\10\0\13\1\5\0\3\1\33\0\6\1"+
    "\1\0\1\1\17\0\2\1\7\0\2\1\12\0\3\1\2\0\2\1\1\0\16\1\15\0\11\1\13\0\1\1\30"+
    "\0\6\1\4\0\2\1\4\0\1\1\5\0\6\1\4\0\1\1\11\0\1\1\3\0\1\1\7\0\11\1\7\0\5\1\17"+
    "\0\26\1\3\0\1\1\2\0\1\1\7\0\11\1\4\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0\1\1"+
    "\3\0\4\1\3\0\1\1\20\0\1\1\15\0\2\1\1\0\1\1\5\0\6\1\4\0\2\1\1\0\2\1\1\0\2\1"+
    "\1\0\2\1\17\0\4\1\1\0\1\1\3\0\3\1\20\0\11\1\1\0\2\1\1\0\2\1\1\0\5\1\3\0\1"+
    "\1\2\0\1\1\30\0\1\1\13\0\10\1\2\0\1\1\3\0\1\1\1\0\6\1\3\0\3\1\1\0\4\1\3\0"+
    "\2\1\1\0\1\1\1\0\2\1\3\0\2\1\3\0\3\1\3\0\14\1\13\0\10\1\1\0\2\1\10\0\3\1\5"+
    "\0\4\1\1\0\5\1\3\0\1\1\3\0\2\1\15\0\13\1\2\0\1\1\21\0\1\1\5\0\22\1\3\0\10"+
    "\1\1\0\11\1\1\0\1\1\2\0\7\1\11\0\1\1\1\0\2\1\15\0\2\1\1\0\1\1\2\0\2\1\1\0"+
    "\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2"+
    "\1\11\0\1\1\2\0\5\1\1\0\1\1\25\0\14\1\1\0\24\1\13\0\5\1\3\0\6\1\4\0\4\1\3"+
    "\0\1\1\3\0\2\1\7\0\3\1\4\0\15\1\14\0\1\1\1\0\6\1\1\0\1\1\5\0\1\1\2\0\13\1"+
    "\1\0\15\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1"+
    "\1\0\4\1\2\0\16\1\2\0\6\1\2\0\15\1\2\0\1\1\1\0\10\1\7\0\15\1\1\0\6\1\23\0"+
    "\1\1\4\0\1\1\3\0\11\1\1\0\1\1\5\0\17\1\1\0\16\1\2\0\14\1\13\0\1\1\15\0\7\1"+
    "\7\0\16\1\15\0\2\1\11\0\4\1\1\0\4\1\3\0\2\1\11\0\10\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\6\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1\5\0\1\1\15\0"+
    "\1\1\2\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1\6\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\4\1\1\0\13\1\2\0\4\1\5\0\5\1\4\0\1\1\4\0\2\1\13\0\5\1\6\0\4\1\3\0\2\1\14"+
    "\0\10\1\7\0\10\1\1\0\7\1\6\0\2\1\12\0\5\1\5\0\2\1\3\0\7\1\6\0\3\1\12\0\2\1"+
    "\13\0\11\1\2\0\27\1\2\0\7\1\1\0\3\1\1\0\4\1\1\0\4\1\2\0\6\1\3\0\1\1\1\0\1"+
    "\1\2\0\5\1\1\0\12\1\12\0\5\1\1\0\3\1\1\0\10\1\4\0\7\1\3\0\1\1\3\0\2\1\1\0"+
    "\1\1\3\0\2\1\2\0\5\1\2\0\1\1\1\0\1\1\30\0\3\1\3\0\6\1\2\0\6\1\2\0\6\1\11\0"+
    "\7\1\4\0\5\1\3\0\5\1\5\0\1\1\1\0\10\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\12\1\6\0\12\1\2\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1\3\0\14\1\1\0\16\1\1\0\2\1\1"+
    "\0\2\1\1\0\10\1\6\0\4\1\4\0\16\1\2\0\1\1\1\0\14\1\1\0\2\1\3\0\1\1\2\0\4\1"+
    "\1\0\2\1\12\0\10\1\6\0\6\1\1\0\3\1\1\0\12\1\3\0\1\1\12\0\4\1\25\0\1\1\1\0"+
    "\1\1\3\0\7\1\1\0\1\1\1\0\4\1\1\0\17\1\1\0\2\1\14\0\3\1\4\0\2\1\1\0\1\1\20"+
    "\0\4\1\10\0\1\1\13\0\10\1\5\0\3\1\2\0\1\1\2\0\2\1\2\0\4\1\1\0\14\1\1\0\1\1"+
    "\1\0\7\1\1\0\21\1\1\0\4\1\2\0\10\1\1\0\7\1\1\0\14\1\1\0\4\1\1\0\5\1\1\0\1"+
    "\1\3\0\14\1\2\0\10\1\1\0\2\1\1\0\1\1\2\0\1\1\1\0\12\1\1\0\4\1\1\0\1\1\1\0"+
    "\1\1\6\0\1\1\4\0\1\1\1\0\1\1\1\0\1\1\1\0\3\1\1\0\2\1\1\0\1\1\2\0\1\1\1\0\1"+
    "\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0\2\1\1\0\1\1\2\0\4\1\1\0\7\1\1\0\4\1\1\0\4\1"+
    "\1\0\1\1\1\0\12\1\1\0\5\1\1\0\3\1\1\0\5\1\1\0\5\1");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\11\0\1\2\5\0\1\1\1\3\4\1\1\4"+
    "\1\5\4\4\1\6\1\4\3\7\1\10\1\7\1\11"+
    "\1\12\1\13\1\14\2\12\1\15\1\16\1\12\1\17"+
    "\1\20\1\21\1\22\1\23\1\21\1\24\1\25\2\24"+
    "\1\2\1\26\1\4\1\27\1\17\3\30\1\31\1\7"+
    "\3\31\1\32\1\33\1\34\1\0\1\35\1\36\14\0"+
    "\1\36\1\37\1\21\1\0\1\40\2\0\1\41\1\42"+
    "\1\43\11\0\1\44\1\45\1\46\1\0\1\47\3\0"+
    "\1\17\3\0\1\50\2\0\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u0384\0\u044c"+
    "\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0384\0\u03e8\0\u0384\0\u0546"+
    "\0\u0578\0\u0384\0\u03e8\0\u0384\0\u0384\0\u05aa\0\u0384\0\u03e8"+
    "\0\u05dc\0\u060e\0\u0384\0\u0640\0\u0672\0\u0384\0\u06a4\0\u0384"+
    "\0\u0384\0\u06d6\0\u0384\0\u0384\0\u03e8\0\u0708\0\u073a\0\u0384"+
    "\0\u076c\0\u079e\0\u07d0\0\u0384\0\u03e8\0\u0640\0\u0384\0\u0802"+
    "\0\u0546\0\u03e8\0\u0834\0\u0384\0\u0866\0\u0898\0\u08ca\0\u0384"+
    "\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u047e"+
    "\0\u04b0\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0384\0\u0384\0\u0b22"+
    "\0\u0b54\0\u0384\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0384\0\u0c4e"+
    "\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde"+
    "\0\u0384\0\u0384\0\u0384\0\u0e10\0\u0384\0\u0e42\0\u0e74\0\u0ea6"+
    "\0\u0384\0\u0ed8\0\u0f0a\0\u0f3c\0\u0384\0\u0f6e\0\u0fa0\0\u0384";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\21\1\22\3\21\1\23\3\21\1\24\27\21\1\25"+
    "\4\21\1\26\1\23\10\21\3\27\1\30\5\27\1\31"+
    "\1\32\11\27\2\33\1\27\1\34\11\27\1\35\1\27"+
    "\1\36\16\27\6\37\1\40\4\37\1\41\25\37\1\42"+
    "\1\37\1\43\2\37\1\44\13\37\1\45\1\46\1\45"+
    "\1\30\1\46\6\45\1\47\1\45\24\46\2\45\1\50"+
    "\7\45\7\46\1\45\1\46\1\45\1\30\1\46\6\45"+
    "\1\51\1\45\24\46\2\45\1\50\7\45\7\46\3\45"+
    "\1\52\35\45\1\53\1\45\1\50\1\45\1\54\14\45"+
    "\3\55\1\30\4\55\1\56\3\45\25\55\1\53\3\55"+
    "\1\54\14\55\3\57\1\30\5\57\1\60\1\61\26\57"+
    "\1\53\3\57\1\62\14\57\11\63\1\64\31\63\1\65"+
    "\4\63\1\66\23\63\1\64\30\63\1\65\4\63\1\66"+
    "\11\63\41\67\1\70\2\67\1\71\15\67\7\27\1\72"+
    "\3\27\1\47\27\27\1\36\16\27\3\45\1\30\3\45"+
    "\1\73\3\45\1\51\25\45\1\53\1\45\1\50\16\45"+
    "\3\74\1\30\7\74\1\47\25\74\1\53\1\74\1\75"+
    "\1\74\1\76\14\74\1\77\1\100\4\77\1\101\6\77"+
    "\24\100\2\77\1\102\3\77\1\103\3\77\7\100\1\77"+
    "\1\100\4\77\1\101\6\77\24\100\2\77\1\102\3\77"+
    "\1\104\3\77\7\100\3\21\1\0\3\21\1\0\3\21"+
    "\1\0\27\21\1\0\4\21\1\26\1\0\10\21\3\0"+
    "\1\22\141\0\1\105\2\0\1\105\2\0\1\106\4\0"+
    "\1\107\24\105\3\0\1\110\1\111\5\0\7\105\1\0"+
    "\1\112\2\0\1\112\2\0\1\113\5\0\16\112\1\114"+
    "\5\112\12\0\1\114\1\115\1\112\1\116\1\117\2\112"+
    "\3\21\1\0\7\21\1\0\27\21\1\0\4\21\1\26"+
    "\11\21\3\0\1\30\56\0\11\120\1\63\50\120\12\121"+
    "\1\63\47\121\34\0\2\122\45\0\2\123\45\0\1\124"+
    "\67\0\1\125\46\0\2\46\1\0\3\46\6\0\24\46"+
    "\12\0\7\46\45\0\1\126\17\0\1\52\117\0\1\127"+
    "\20\0\3\55\1\0\4\55\4\0\25\55\1\0\3\55"+
    "\1\0\14\55\3\57\1\0\35\57\1\0\3\57\1\130"+
    "\17\57\1\0\35\57\1\127\3\57\1\130\14\57\51\0"+
    "\1\63\10\0\41\67\1\0\2\67\1\131\56\67\1\70"+
    "\20\67\1\0\2\72\1\0\3\72\6\0\24\72\12\0"+
    "\7\72\1\0\2\73\1\0\3\73\6\0\24\73\12\0"+
    "\7\73\1\0\3\100\1\0\1\100\6\0\25\100\1\0"+
    "\2\100\7\0\7\100\41\0\1\132\21\0\2\105\1\0"+
    "\3\105\6\0\24\105\12\0\7\105\1\0\2\106\1\0"+
    "\3\106\6\0\24\106\12\0\7\106\6\0\1\133\6\0"+
    "\1\134\45\0\1\135\2\0\1\135\2\0\1\136\5\0"+
    "\24\135\12\0\7\135\1\0\2\112\1\0\3\112\6\0"+
    "\24\112\11\0\1\137\7\112\2\0\1\140\55\0\1\141"+
    "\2\0\2\112\1\0\3\112\6\0\5\112\1\142\16\112"+
    "\11\0\1\137\7\112\1\0\2\112\1\0\3\112\6\0"+
    "\10\112\1\143\3\112\1\144\7\112\11\0\1\137\7\112"+
    "\1\0\2\112\1\0\3\112\6\0\20\112\1\145\3\112"+
    "\11\0\1\137\7\112\1\0\2\112\1\0\3\112\6\0"+
    "\22\112\1\146\1\112\11\0\1\137\7\112\36\0\2\147"+
    "\52\0\2\150\71\0\1\151\66\0\1\152\13\0\41\57"+
    "\1\0\3\57\1\130\14\57\41\67\1\0\20\67\6\0"+
    "\1\153\71\0\2\154\43\0\2\135\1\0\3\135\6\0"+
    "\24\135\12\0\7\135\1\0\2\136\1\0\3\136\6\0"+
    "\24\136\12\0\7\136\2\0\1\140\47\0\1\155\11\0"+
    "\1\156\12\0\1\156\2\0\1\156\5\0\1\156\7\0"+
    "\2\156\14\0\1\156\4\0\1\156\1\0\2\112\1\0"+
    "\3\112\6\0\24\112\11\0\1\155\7\112\1\0\2\112"+
    "\1\0\3\112\6\0\2\112\1\157\21\112\11\0\1\137"+
    "\7\112\1\0\2\112\1\0\3\112\6\0\10\112\1\142"+
    "\13\112\11\0\1\137\7\112\1\0\2\112\1\0\3\112"+
    "\6\0\2\112\1\114\21\112\11\0\1\137\7\112\1\0"+
    "\2\112\1\0\3\112\6\0\24\112\11\0\1\137\2\112"+
    "\1\144\4\112\32\0\2\160\60\0\2\161\46\0\1\162"+
    "\43\0\1\156\12\0\1\156\2\0\1\156\5\0\1\156"+
    "\7\0\2\156\12\0\1\155\1\0\1\156\4\0\1\156"+
    "\1\0\2\112\1\0\3\112\6\0\24\112\11\0\1\137"+
    "\2\112\1\142\4\112\40\0\1\163\42\0\2\164\57\0"+
    "\1\165\64\0\1\166\62\0\2\167\62\0\1\170\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4050];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\11\0\1\1\5\0\2\1\1\11\3\1\1\11"+
    "\5\1\1\11\1\1\1\11\2\1\1\11\1\1\2\11"+
    "\1\1\1\11\3\1\1\11\2\1\1\11\1\1\2\11"+
    "\1\1\2\11\3\1\1\11\3\1\1\11\2\1\1\11"+
    "\4\1\1\11\2\1\1\0\1\11\1\1\14\0\2\11"+
    "\1\1\1\0\1\11\2\0\2\1\1\11\11\0\3\11"+
    "\1\0\1\11\3\0\1\11\3\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _HtmlLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HtmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return XmlTokenType.XML_DATA_CHARACTERS;
            }
          case 42: break;
          case 2: 
            { return XmlTokenType.XML_PI_TARGET;
            }
          case 43: break;
          case 3: 
            { return XmlTokenType.XML_REAL_WHITE_SPACE;
            }
          case 44: break;
          case 4: 
            { return XmlTokenType.XML_BAD_CHARACTER;
            }
          case 45: break;
          case 5: 
            { return XmlTokenType.XML_WHITE_SPACE;
            }
          case 46: break;
          case 6: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
            }
          case 47: break;
          case 7: 
            { return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 48: break;
          case 8: 
            { // according to HTML spec (http://www.w3.org/html/wg/drafts/html/master/syntax.html#comments)
  // comments should start with <!-- and end with --> thus making <!--> absolutely valid comment
  // please note that it's not true for XML (http://www.w3.org/TR/REC-xml/#sec-comments)
  int loc = getTokenStart();
  char prev = zzBuffer.charAt(loc - 1);
  char prevPrev = zzBuffer.charAt(loc - 2);
  if (prev == '-' && prevPrev == '-') {
    yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
  }
  return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 49: break;
          case 9: 
            { yybegin(C_COMMENT_START); return XmlTokenType.XML_CONDITIONAL_COMMENT_START;
            }
          case 50: break;
          case 10: 
            { yybegin(YYINITIAL); yypushback(1); break;
            }
          case 51: break;
          case 11: 
            { yybegin(BEFORE_TAG_ATTRIBUTES); return XmlTokenType.XML_NAME;
            }
          case 52: break;
          case 12: 
            { return XmlTokenType.XML_START_TAG_START;
            }
          case 53: break;
          case 13: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_WHITE_SPACE;
            }
          case 54: break;
          case 14: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
            }
          case 55: break;
          case 15: 
            { return XmlTokenType.XML_NAME;
            }
          case 56: break;
          case 16: 
            { yybegin(ATTRIBUTE_VALUE_START); return XmlTokenType.XML_EQ;
            }
          case 57: break;
          case 17: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
            }
          case 58: break;
          case 18: 
            { yybegin(ATTRIBUTE_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          case 59: break;
          case 19: 
            { yybegin(ATTRIBUTE_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          case 60: break;
          case 20: 
            { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
            }
          case 61: break;
          case 21: 
            { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
            }
          case 62: break;
          case 22: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
            }
          case 63: break;
          case 23: 
            { yybegin(TAG_CHARACTERS); return XmlTokenType.XML_NAME;
            }
          case 64: break;
          case 24: 
            { return XmlTokenType.XML_TAG_CHARACTERS;
            }
          case 65: break;
          case 25: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 66: break;
          case 26: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_END;
            }
          case 67: break;
          case 27: 
            { yybegin(START_TAG_NAME); yypushback(yylength());
            }
          case 68: break;
          case 28: 
            { yybegin(START_TAG_NAME2); yypushback(yylength());
            }
          case 69: break;
          case 29: 
            { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
            }
          case 70: break;
          case 30: 
            { return XmlTokenType.XML_END_TAG_START;
            }
          case 71: break;
          case 31: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
            }
          case 72: break;
          case 32: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_START_END;
            }
          case 73: break;
          case 33: 
            { yybegin(END_TAG_NAME); yypushback(yylength());
            }
          case 74: break;
          case 34: 
            { yybegin(END_TAG_NAME2); yypushback(yylength());
            }
          case 75: break;
          case 35: 
            { return XmlTokenType.XML_ENTITY_REF_TOKEN;
            }
          case 76: break;
          case 36: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
            }
          case 77: break;
          case 37: 
            { yybegin(C_COMMENT_END); return XmlTokenType.XML_CONDITIONAL_COMMENT_END_START;
            }
          case 78: break;
          case 38: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
            }
          case 79: break;
          case 39: 
            { return XmlTokenType.XML_CHAR_ENTITY_REF;
            }
          case 80: break;
          case 40: 
            { return XmlTokenType.XML_DOCTYPE_PUBLIC;
            }
          case 81: break;
          case 41: 
            { yybegin(DOC_TYPE); return XmlTokenType.XML_DOCTYPE_START;
            }
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
