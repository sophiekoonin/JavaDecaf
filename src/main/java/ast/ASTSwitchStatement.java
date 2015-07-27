/* Generated By:JJTree: Do not edit this line. ASTSwitchStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main.java.ast;

import main.java.parser.*;

import javax.swing.text.Style;
import java.io.PrintWriter;

public
class ASTSwitchStatement extends ConditionalClosingBraceSimpleNode implements IndentationContainer{
    public ASTSwitchStatement(int id) {
        super(id);
    }

    public ASTSwitchStatement(JDCParser p, int id) {
        super(p, id);
    }

    public void process(PrintWriter ostr) {
        int breakCount = 0;
        int statementCount = 0;
        boolean defaultPresent = false;
        for (int i = 0; i < jjtGetNumChildren(); i++){
            if (jjtGetChild(i) instanceof ASTBreakStatement) {
                breakCount++;
            } else if (jjtGetChild(i) instanceof ASTStatementExpression) {
                statementCount++;
            } else if (jjtGetChild(i) instanceof ASTDefaultSwitchLabel) {
                defaultPresent = true;
                statementCount++;
            }
        }
        if (breakCount != statementCount) {
            String warning = "Each case in a switch block should be terminated with \"break;\" to stop it continuing to execute, e.g.:"+
                    "\nswitch(number) {"+
                    "\n    case 0: "+
                    "\n        println(\"zero\");" +
                    "\n        break;" +
                    "\n    case 1: "+
                    "\n        println(\"one\");"+
                    "\n        break;"+
                    "\n    default:"+
                    "\n        break;" +
                    "\n}";
            StyleWarnings.generateWarning(begin, parser, warning);
        }

        if (!defaultPresent) {
            String warning = "Switch blocks must end with a default case, which handles any values not covered by the cases, e.g.:"+
                    "\nswitch(number) {"+
                    "\n    case 0: "+
                    "\n        println(\"zero\");" +
                    "\n        break;" +
                    "\n    case 1: "+
                    "\n        println(\"one\");"+
                    "\n        break;"+
                    "\n    default:"+
                    "\n        break;" +
                    "\n}";
            StyleWarnings.generateWarning(begin,parser,warning);
        }
        super.process(ostr);
    }

}
/* JavaCC - OriginalChecksum=f62d7acfc97a58848fa4c171458d37dd (do not edit this line) */
