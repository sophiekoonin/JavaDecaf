/* Generated By:JavaCC: Do not edit this line. ParseException.java Version 5.0 */
/* JavaCCOptions:KEEP_LINE_COL=null */
package parser;

/**
 * This exception is thrown when parse errors are encountered.
 * You can explicitly create objects of this exception type by
 * calling the method generateParseException in the generated
 * parser.
 *
 * You can modify this class to customize your error reporting
 * mechanisms so long as you retain the public fields.
 */
public class ParseException extends Exception {

  /**
   * The version identifier for this Serializable class.
   * Increment only if the <i>serialized</i> form of the
   * class changes.
   */
  private static final long serialVersionUID = 1L;

  /**
   * This constructor is used by the method "generateParseException"
   * in the generated parser.  Calling this constructor generates
   * a new object of this type with the fields "currentToken",
   * "expectedTokenSequences", and "tokenImage" set.
   */
  public ParseException(Token currentTokenVal,
                        int[][] expectedTokenSequencesVal,
                        String[] tokenImageVal
                       )
  {
    super(initialise(currentTokenVal, expectedTokenSequencesVal, tokenImageVal));
    currentToken = currentTokenVal;
    expectedTokenSequences = expectedTokenSequencesVal;
    tokenImage = tokenImageVal;
  }

  /**
   * The following constructors are for use by you for whatever
   * purpose you can think of.  Constructing the exception in this
   * manner makes the exception behave in the normal way - i.e., as
   * documented in the class "Throwable".  The fields "errorToken",
   * "expectedTokenSequences", and "tokenImage" do not contain
   * relevant information.  The JavaCC generated code does not use
   * these constructors.
   */

  public ParseException() {
    super();
  }

  /** Constructor with message. */
  public ParseException(String message) {
    super(message);
  }


  /**
   * This is the last token that has been consumed successfully.  If
   * this object has been created due to a parse error, the token
   * followng this token will (therefore) be the first error token.
   */
  public Token currentToken;

  /**
   * Each entry in this array is an array of integers.  Each array
   * of integers represents a sequence of tokens (by their ordinal
   * values) that is expected at this point of the parse.
   */
  public int[][] expectedTokenSequences;

  /**
   * This is a reference to the "tokenImage" array of the generated
   * parser within which the parse error occurred.  This array is
   * defined in the generated ...Constants interface.
   */
  public String[] tokenImage;

  /**
   * It uses "currentToken" and "expectedTokenSequences" to generate a parse
   * error message and returns it.  If this object has been created
   * due to a parse error, and you do not catch it (it gets thrown
   * from the parser) the correct error message
   * gets displayed.
   */
  private static String initialise(Token currentToken,
                           int[][] expectedTokenSequences,
                           String[] tokenImage) {
    String eol = System.getProperty("line.separator", "\n");
    StringBuffer expected = new StringBuffer();
    int maxSize = 0;
    for (int i = 0; i < expectedTokenSequences.length; i++) {
      if (maxSize < expectedTokenSequences[i].length) {
        maxSize = expectedTokenSequences[i].length;
      }
      for (int j = 0; j < expectedTokenSequences[i].length; j++) {
        expected.append(tokenImage[expectedTokenSequences[i][j]]).append(' ');
      }
      if (expectedTokenSequences[i][expectedTokenSequences[i].length - 1] != 0) {
        expected.append("...");
      }
      expected.append(eol).append("    ");
    } //TODO could delete this?
    String retval = "\nEncountered \"";
    Token tok = currentToken.next;
    for (int i = 0; i < maxSize; i++) {
      if (i != 0) retval += " ";
      if (tok.kind == 0) {  //end of file
        retval += "end of file";
        break;
      }
      retval += currentToken.image; //print the token appearing before the error
      retval += "\" followed by \"";
      retval += add_escapes(tok.image); //print the offending token
    }
    retval += "\" at line " + currentToken.next.beginLine + ", column " + currentToken.next.beginColumn;
    retval += "." + eol;

      if (currentToken.kind == JDCParserConstants.IDENTIFIER && (tok.kind >= JDCParserConstants.INTEGER_LITERAL && tok.kind <= JDCParserConstants.STRING_LITERAL)) {    //if current token is IDENTIFIER and next is any literal
          retval += "You may have forgotten to include parentheses around an argument- \"" + currentToken.image + "(" + currentToken.next.image + ")\"";
      } else if ((currentToken.kind == JDCParserConstants.SEMICOLON || currentToken.kind == JDCParserConstants.RBRACE) && tok.kind == JDCParserConstants.EOF) {   //semicolon or closing brace followed by EOF
          retval += "You may have forgotten a closing brace } after \"" + currentToken.image + "\"";
      } else if ((currentToken.kind == JDCParserConstants.RPAREN || currentToken.kind == JDCParserConstants.IDENTIFIER) && //rparen or identifier
              (tok.kind == JDCParserConstants.EOF || //followed by EOF...
                      ((tok.specialToken!=null && tok.specialToken.image.equals(eol))))) {  //...or newline
          retval += "You may be missing a semicolon after \"" + currentToken.image + "\"";
      } else if (currentToken.kind == JDCParserConstants.STRING_LITERAL && tok.kind == JDCParserConstants.IDENTIFIER) { //String literal followed by identifier - didn't escape quotations or use + for concatenation
          retval += "You may need to escape quotation marks within the string, by adding a backslash: \ne.g. println(\"say \\\"hello\\\"!\") ." +
                  "\nIf you are trying to print a String in quotations followed by a variable, \nmake sure you concatenate them with +: \ne.g. println(\"hello\" + name + \"!\")\"; .";
      } else if (currentToken.kind == JDCParserConstants.ASSIGN && (tok.kind == JDCParserConstants.GT || tok.kind == JDCParserConstants.LT)) {  //Equals followed by gt/lt - wrong order
          retval += "Did you mean: " + tok.image + currentToken.image; //suggest correct order
      } else if (currentToken.kind == JDCParserConstants.IDENTIFIER && tok.kind == JDCParserConstants.CLASS) {
          retval += "Did you mean one of: public, private, protected"; //access modifiers before 'class'
      } else if (currentToken.kind == JDCParserConstants.RPAREN && tok.kind == JDCParserConstants.LBRACE) {
          retval += "Unmatched parentheses: you may be missing a closing parenthesis.";
      } else if (currentToken.kind == JDCParserConstants.RPAREN && tok.kind == JDCParserConstants.SEMICOLON && expectedTokenSequences[0][0] == JDCParserConstants.THROWS) { //rparen, semicolon, and first expected token is 'throws'
          retval += "There are no semicolons in method declarations.";
      } else if ((currentToken.kind == JDCParserConstants.IDENTIFIER || currentToken.image.equals("void")) && //identifier or "void" followed by reserved keyword
              (tok.kind >= JDCParserConstants.ABSTRACT || tok.kind <= JDCParserConstants.WHILE)) {
          retval += "\"" + tok.image + "\" is a reserved keyword in Java and cannot be used as a method or variable name.";
      }

    retval += expected.toString();    //DEBUG - print list of tokens expected afterwards
    return retval;
  }

  /**
   * The end of line string for this machine.
   */
  protected String eol = System.getProperty("line.separator", "\n");

  /**
   * Used to convert raw characters to their escaped version
   * when these raw version cannot be used as part of an ASCII
   * string literal.
   */
  static String add_escapes(String str) {
      StringBuffer retval = new StringBuffer();
      char ch;
      for (int i = 0; i < str.length(); i++) {
        switch (str.charAt(i))
        {
           case 0 :
              continue;
           case '\b':
              retval.append("\\b");
              continue;
           case '\t':
              retval.append("\\t");
              continue;
           case '\n':
              retval.append("\\n");
              continue;
           case '\f':
              retval.append("\\f");
              continue;
           case '\r':
              retval.append("\\r");
              continue;
           case '\"':
              retval.append("\\\"");
              continue;
           case '\'':
              retval.append("\\\'");
              continue;
           case '\\':
              retval.append("\\\\");
              continue;
           default:
              if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                 String s = "0000" + Integer.toString(ch, 16);
                 retval.append("\\u" + s.substring(s.length() - 4, s.length()));
              } else {
                 retval.append(ch);
              }
              continue;
        }
      }
      return retval.toString();
   }

}
/* JavaCC - OriginalChecksum=16ba3edbb338127335444b2b77a37aa1 (do not edit this line) */
