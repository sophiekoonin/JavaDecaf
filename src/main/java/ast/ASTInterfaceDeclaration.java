/* Generated By:JJTree: Do not edit this line. ASTInterfaceDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main.java.ast;

import main.java.parser.*;

public
class ASTInterfaceDeclaration extends ClosingBraceSimpleNode implements IndentationContainer {
  public ASTInterfaceDeclaration(int id) {
    super(id);
  }

  public ASTInterfaceDeclaration(JDCParser p, int id) {
    super(p, id);
    indent = false;
  }

}
/* JavaCC - OriginalChecksum=2db2170d7a159d7f7592160b8eba4f7c (do not edit this line) */