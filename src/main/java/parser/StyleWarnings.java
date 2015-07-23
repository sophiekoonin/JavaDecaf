package main.java.parser;

/**
 * Class containing static methods for throwing out style warnings.
 * @author Sophie Koonin
 */
public class StyleWarnings {
    private static final int INDENTATION_SPACES = 4;

    /**
     * Create a warning message with the token image, line and column of the token, and add it to the parser's
     * warning list.
     * @param t - the offending token
     * @param parser - the parser in use
     * @param message - the warning message
     */
    public static void generateWarning(Token t, JDCParser parser, String message) {
        String warning = "Warning: encountered \"" + t.image + "\" at line " + t.endLine + ", column " + t.endColumn +
                ":" + message;
        parser.addWarning(warning);
    }

    /**
     * Check the indentation level and generate a warning if not correctly indented.
     * @param parser the parser in use
     * @param t the indented token
     * @param indentationLevel the expected indentation level
     */
    public static void checkIndentation(JDCParser parser, Token t, int indentationLevel) {
        int indentationCount = 0;
        Token countToken = t;
        while (countToken != null) {
            if (countToken.specialToken != null && countToken.specialToken.image.equals(" ")) {
                indentationCount++;
            }
            countToken = countToken.specialToken;
        }
        /* if the actual number of indented spaces doesn't match the indentation level multiplied by the number
        of spaces to indent, add this warning to the warning list */

        if (indentationCount != (indentationLevel * INDENTATION_SPACES)) {
            String warning = "methods, loops and their contents should be indented by multiples of four spaces, e.g.:" +
                    "\nvoid isLessThan(int number1, int number2) {"+
                    "\n    if (x < y) {" +
                    "\n        println(x + \"is less than\" + y);" +
                    "\n    }" +
                    "\n}";
            generateWarning(t, parser, warning);
        }


    }

}
