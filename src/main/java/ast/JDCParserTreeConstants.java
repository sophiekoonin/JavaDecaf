/* Generated By:JavaCC: Do not edit this line. JDCParserTreeConstants.java Version 5.0 */
package main.java.ast;

import main.java.parser.*;

public interface JDCParserTreeConstants
{
  public int JJTCOMPILATIONUNIT = 0;
  public int JJTPACKAGEDECLARATION = 1;
  public int JJTIMPORTDECLARATION = 2;
  public int JJTTYPEDECLARATION = 3;
  public int JJTCLASSDECLARATION = 4;
  public int JJTUNMODIFIEDCLASSDECLARATION = 5;
  public int JJTCLASSBODY = 6;
  public int JJTCLASSBODYDECLARATION = 7;
  public int JJTNESTEDCLASSDECLARATION = 8;
  public int JJTMETHODDECLARATIONLOOKAHEAD = 9;
  public int JJTINTERFACEDECLARATION = 10;
  public int JJTNESTEDINTERFACEDECLARATION = 11;
  public int JJTUNMODIFIEDINTERFACEDECLARATION = 12;
  public int JJTINTERFACEMEMBERDECLARATION = 13;
  public int JJTFIELDDECLARATION = 14;
  public int JJTVARIABLEDECLARATOR = 15;
  public int JJTVARIABLEDECLARATORID = 16;
  public int JJTVARIABLEINITIALIZER = 17;
  public int JJTARRAYINITIALIZER = 18;
  public int JJTMETHODDECLARATION = 19;
  public int JJTMETHODDECLARATOR = 20;
  public int JJTFORMALPARAMETERS = 21;
  public int JJTFORMALPARAMETER = 22;
  public int JJTCONSTRUCTORDECLARATION = 23;
  public int JJTEXPLICITCONSTRUCTORINVOCATION = 24;
  public int JJTINITIALIZER = 25;
  public int JJTTYPE = 26;
  public int JJTPRIMITIVETYPE = 27;
  public int JJTRESULTTYPE = 28;
  public int JJTNAME = 29;
  public int JJTNAMELIST = 30;
  public int JJTEXPRESSION = 31;
  public int JJTASSIGNMENT = 32;
  public int JJTASSIGNMENTOPERATOR = 33;
  public int JJTCONDITIONALEXPRESSION = 34;
  public int JJTCONDITIONALOREXPRESSION = 35;
  public int JJTCONDITIONALANDEXPRESSION = 36;
  public int JJTINCLUSIVEOREXPRESSION = 37;
  public int JJTEXCLUSIVEOREXPRESSION = 38;
  public int JJTANDEXPRESSION = 39;
  public int JJTEQUALITYEXPRESSION = 40;
  public int JJTINSTANCEOFEXPRESSION = 41;
  public int JJTRELATIONALEXPRESSION = 42;
  public int JJTSHIFTEXPRESSION = 43;
  public int JJTADDITIVEEXPRESSION = 44;
  public int JJTMULTIPLICATIVEEXPRESSION = 45;
  public int JJTUNARYEXPRESSION = 46;
  public int JJTPREINCREMENTEXPRESSION = 47;
  public int JJTPREDECREMENTEXPRESSION = 48;
  public int JJTUNARYEXPRESSIONNOTPLUSMINUS = 49;
  public int JJTCASTLOOKAHEAD = 50;
  public int JJTPOSTFIXEXPRESSION = 51;
  public int JJTCASTEXPRESSION = 52;
  public int JJTPRIMARYEXPRESSION = 53;
  public int JJTPRIMARYPREFIX = 54;
  public int JJTPRIMARYSUFFIX = 55;
  public int JJTLITERAL = 56;
  public int JJTBOOLEANLITERAL = 57;
  public int JJTNULLLITERAL = 58;
  public int JJTARGUMENTS = 59;
  public int JJTARGUMENTLIST = 60;
  public int JJTALLOCATIONEXPRESSION = 61;
  public int JJTARRAYDIMENSIONS = 62;
  public int JJTSTATEMENT = 63;
  public int JJTLABELEDSTATEMENT = 64;
  public int JJTBLOCK = 65;
  public int JJTBLOCKSTATEMENT = 66;
  public int JJTLOCALVARIABLEDECLARATION = 67;
  public int JJTEMPTYSTATEMENT = 68;
  public int JJTSTATEMENTEXPRESSION = 69;
  public int JJTSWITCHSTATEMENT = 70;
  public int JJTSWITCHLABEL = 71;
  public int JJTIFSTATEMENT = 72;
  public int JJTWHILESTATEMENT = 73;
  public int JJTDOSTATEMENT = 74;
  public int JJTFORSTATEMENT = 75;
  public int JJTFORINIT = 76;
  public int JJTSTATEMENTEXPRESSIONLIST = 77;
  public int JJTFORUPDATE = 78;
  public int JJTBREAKSTATEMENT = 79;
  public int JJTCONTINUESTATEMENT = 80;
  public int JJTRETURNSTATEMENT = 81;
  public int JJTTHROWSTATEMENT = 82;
  public int JJTSYNCHRONIZEDSTATEMENT = 83;
  public int JJTTRYSTATEMENT = 84;
  public int JJTDECAFBLOCK = 85;
  public int JJTDECAFMETHOD = 86;
  public int JJTSETFIRSTLASTTOKEN = 87;


  public String[] jjtNodeName = {
    "CompilationUnit",
    "PackageDeclaration",
    "ImportDeclaration",
    "TypeDeclaration",
    "ClassDeclaration",
    "UnmodifiedClassDeclaration",
    "ClassBody",
    "ClassBodyDeclaration",
    "NestedClassDeclaration",
    "MethodDeclarationLookahead",
    "InterfaceDeclaration",
    "NestedInterfaceDeclaration",
    "UnmodifiedInterfaceDeclaration",
    "InterfaceMemberDeclaration",
    "FieldDeclaration",
    "VariableDeclarator",
    "VariableDeclaratorId",
    "VariableInitializer",
    "ArrayInitializer",
    "MethodDeclaration",
    "MethodDeclarator",
    "FormalParameters",
    "FormalParameter",
    "ConstructorDeclaration",
    "ExplicitConstructorInvocation",
    "Initializer",
    "Type",
    "PrimitiveType",
    "ResultType",
    "Name",
    "NameList",
    "Expression",
    "Assignment",
    "AssignmentOperator",
    "ConditionalExpression",
    "ConditionalOrExpression",
    "ConditionalAndExpression",
    "InclusiveOrExpression",
    "ExclusiveOrExpression",
    "AndExpression",
    "EqualityExpression",
    "InstanceOfExpression",
    "RelationalExpression",
    "ShiftExpression",
    "AdditiveExpression",
    "MultiplicativeExpression",
    "UnaryExpression",
    "PreIncrementExpression",
    "PreDecrementExpression",
    "UnaryExpressionNotPlusMinus",
    "CastLookahead",
    "PostfixExpression",
    "CastExpression",
    "PrimaryExpression",
    "PrimaryPrefix",
    "PrimarySuffix",
    "Literal",
    "BooleanLiteral",
    "NullLiteral",
    "Arguments",
    "ArgumentList",
    "AllocationExpression",
    "ArrayDimensions",
    "Statement",
    "LabeledStatement",
    "Block",
    "BlockStatement",
    "LocalVariableDeclaration",
    "EmptyStatement",
    "StatementExpression",
    "SwitchStatement",
    "SwitchLabel",
    "IfStatement",
    "WhileStatement",
    "DoStatement",
    "ForStatement",
    "ForInit",
    "StatementExpressionList",
    "ForUpdate",
    "BreakStatement",
    "ContinueStatement",
    "ReturnStatement",
    "ThrowStatement",
    "SynchronizedStatement",
    "TryStatement",
    "DecafBlock",
    "DecafMethod",
    "setFirstLastToken",
  };
}
/* JavaCC - OriginalChecksum=35abc877295dfd2bf666285e8789370f (do not edit this line) */