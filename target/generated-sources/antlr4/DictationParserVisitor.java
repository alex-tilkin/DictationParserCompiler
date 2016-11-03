// Generated from DictationParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DictationParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DictationParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(DictationParserParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#creationCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationCommand(DictationParserParser.CreationCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#creationVerb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationVerb(DictationParserParser.CreationVerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateField(DictationParserParser.CreateFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMethod(DictationParserParser.CreateMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConstructor(DictationParserParser.CreateConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDataType(DictationParserParser.CreateDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBlock(DictationParserParser.CreateBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBlockStatement(DictationParserParser.CreateBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoop(DictationParserParser.CreateLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createForEachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForEachLoop(DictationParserParser.CreateForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateWhileLoop(DictationParserParser.CreateWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createDoWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDoWhileLoop(DictationParserParser.CreateDoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#createForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForLoop(DictationParserParser.CreateForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#navigationCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationCommand(DictationParserParser.NavigationCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#navigationVerb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationVerb(DictationParserParser.NavigationVerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#exitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitCommand(DictationParserParser.ExitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(DictationParserParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#modificationCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificationCommand(DictationParserParser.ModificationCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#modifyAccessLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyAccessLevel(DictationParserParser.ModifyAccessLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#modificationVerb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificationVerb(DictationParserParser.ModificationVerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#selectionCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionCommand(DictationParserParser.SelectionCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#deletionCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletionCommand(DictationParserParser.DeletionCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#invocationCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocationCommand(DictationParserParser.InvocationCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DictationParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(DictationParserParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(DictationParserParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(DictationParserParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#accessLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessLevel(DictationParserParser.AccessLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(DictationParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DictationParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DictationParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DictationParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#elementsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementsElement(DictationParserParser.ElementsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#elementLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementLocation(DictationParserParser.ElementLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#fieldRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldRef(DictationParserParser.FieldRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#elementRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementRef(DictationParserParser.ElementRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#classRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassRef(DictationParserParser.ClassRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#namedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedElement(DictationParserParser.NamedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#elementsName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementsName(DictationParserParser.ElementsNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#enumRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumRef(DictationParserParser.EnumRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#interfaceRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRef(DictationParserParser.InterfaceRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#methodRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodRef(DictationParserParser.MethodRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#unspecifiedRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnspecifiedRef(DictationParserParser.UnspecifiedRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(DictationParserParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#locationRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationRef(DictationParserParser.LocationRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(DictationParserParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DictationParserParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DictationParserParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DictationParserParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DictationParserParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#implementsExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsExtends(DictationParserParser.ImplementsExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#returnsVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsVars(DictationParserParser.ReturnsVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#implementsVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsVars(DictationParserParser.ImplementsVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#extendsVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsVars(DictationParserParser.ExtendsVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#plusVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusVars(DictationParserParser.PlusVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#minusVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusVars(DictationParserParser.MinusVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#equalsVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsVars(DictationParserParser.EqualsVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#isDifferentVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDifferentVars(DictationParserParser.IsDifferentVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#lessThanVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanVars(DictationParserParser.LessThanVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#lessThanEqualsVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqualsVars(DictationParserParser.LessThanEqualsVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#greaterThanVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanVars(DictationParserParser.GreaterThanVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#greaterThanEqualVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqualVars(DictationParserParser.GreaterThanEqualVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#forEachVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachVars(DictationParserParser.ForEachVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#caseVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseVars(DictationParserParser.CaseVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DictationParserParser#periodVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriodVars(DictationParserParser.PeriodVarsContext ctx);
}