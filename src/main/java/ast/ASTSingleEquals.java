/* Generated By:JJTree: Do not edit this line. ASTSingleEquals.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main.java.ast;

import main.java.parser.*;

import java.io.PrintWriter;

public
class ASTSingleEquals extends SimpleNode {
  public ASTSingleEquals(int id) {
    super(id);
  }

  public ASTSingleEquals(JDCParser p, int id) {
    super(p, id);
      indent = false;
  }

  public void process(PrintWriter ostr) {
      super.process(ostr);
      if (ASTUtils.isConditionalLoop(jjtGetParent())) {
          String warning = "You have used assignment operator \'=\' in a loop condition. \nTo check for equality, use double equals \'==\'.";
          StyleWarnings.generateWarning(begin, parser, warning);
      }
  }
}
/* JavaCC - OriginalChecksum=39c72f4e7a703d676eec12fe152654d9 (do not edit this line) */
