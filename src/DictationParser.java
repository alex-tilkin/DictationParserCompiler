import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DictationParser extends DictationParserBaseListener{
	// Region - Fields
	public List<CommandParams> m_Commands = new ArrayList<CommandParams>();
	private CommandParams m_CurrentCommandParams;
	private List<String> m_UnresolvedParamteres = new ArrayList<String>();
	// EndRegion
	
	// Region - Public Methods Top Commands
	@Override
	public void enterCommand(DictationParserParser.CommandContext ctx) {
		m_CurrentCommandParams = new CommandParams();
	}
	
	@Override
	public void exitCommand(DictationParserParser.CommandContext ctx) {
		m_Commands.add(m_CurrentCommandParams);
		m_CurrentCommandParams = null;
	}
	//EndRegion
	
	// Region - Public Methods Creation Commands
	@Override
	public void enterCreationCommand(DictationParserParser.CreationCommandContext ctx) {
		m_CurrentCommandParams.setCommandType(CommandParams.CommandType.Create);
	}
	
	@Override
	public void enterCreateDataType(DictationParserParser.CreateDataTypeContext ctx){
		for (ParseTree child : ctx.children) {
			if(child instanceof TerminalNode == false)
				continue;
			
			TerminalNode typeNode = (TerminalNode)child;
			if(typeNode.getSymbol().getType() == DictationParserLexer.INNER)
				m_CurrentCommandParams.setIsInner(true);
		}
	}
	
	@Override
	public void enterCreateField(DictationParserParser.CreateFieldContext ctx){
		m_CurrentCommandParams.setType(CommandParams.Type.Field);
	}

	@Override
	public void enterCreateMethod(DictationParserParser.CreateMethodContext ctx){
		m_CurrentCommandParams.setType(CommandParams.Type.Method);
		String elementName = "";
		for (ParseTree child : ctx.children) {
			TerminalNode terminalNode = (TerminalNode)child;
			if(terminalNode.getSymbol().getType() != DictationParserLexer.Element)
				continue;
		}
	}
	// EndRegion
	
	// Region - Public Methods Common Commands
	@Override
	public void enterFieldRef(DictationParserParser.FieldRefContext ctx){
		for (ParseTree child : ctx.children) {
			if(child instanceof TerminalNode == false)
				continue;
			
			TerminalNode terminalNode = (TerminalNode)child;
			switch(terminalNode.getSymbol().getType()){
			case DictationParserLexer.Element:
				m_CurrentCommandParams.setElementType(terminalNode.getText());
			}
		}
	}
	
	@Override
	public void enterFieldModifier(DictationParserParser.FieldModifierContext ctx){
		for (ParseTree child : ctx.children) {
			if(child instanceof TerminalNode == false)
				continue;
			
			TerminalNode typeNode = (TerminalNode)child;
			switch(typeNode.getSymbol().getType()){
				case DictationParserLexer.FINAL:
				case DictationParserLexer.CONST:
					m_CurrentCommandParams.setIsFinal(true);
					break;
				case DictationParserLexer.TRANSIENT:
					m_CurrentCommandParams.setIsTransient(true);
					break;
				case DictationParserLexer.VOLATILE:
					m_CurrentCommandParams.setIsVolatile(true);
					break;
			}
		}
	}
	
	@Override
	public void enterModifier(DictationParserParser.ModifierContext ctx) {
		for (ParseTree child : ctx.children) {
			if(child instanceof TerminalNode == false)
				continue;
			
			TerminalNode typeNode = (TerminalNode)child;
			switch(typeNode.getSymbol().getType()){
			case DictationParserParser.ABSTRACT:
				m_CurrentCommandParams.setIsAbstract(true);
				break;
			case DictationParserParser.STATIC:
				m_CurrentCommandParams.setIsStatic(true);
				break;
			}
		}
	}

	@Override
	public void enterDataType(DictationParserParser.DataTypeContext ctx) {
		TerminalNode typeNode = (TerminalNode) ctx.getChild(0);
		
		switch(typeNode.getSymbol().getType()){
			case DictationParserLexer.CLASS:
				m_CurrentCommandParams.setType(CommandParams.Type.Class);
				break;
			case DictationParserLexer.ENUM:
				m_CurrentCommandParams.setType(CommandParams.Type.Enum);
				break;
			case DictationParserLexer.INTERFACE:
				m_CurrentCommandParams.setType(CommandParams.Type.Interface);
				break;
		}
	}
	
	@Override
	public void enterAccessLevel(DictationParserParser.AccessLevelContext ctx) {
		TerminalNode typeNode = (TerminalNode) ctx.getChild(0);
		switch(typeNode.getSymbol().getType()){
		case DictationParserParser.PRIVATE:
			m_CurrentCommandParams.setAccessLevel(CommandParams.AccessLevel.Private);
			break;
		case DictationParserParser.PUBLIC:
			m_CurrentCommandParams.setAccessLevel(CommandParams.AccessLevel.Public);
			break;
		case DictationParserParser.PROTECTED:
			m_CurrentCommandParams.setAccessLevel(CommandParams.AccessLevel.Protected);
			break;
		}
	}
	
	@Override
	public void enterElementsName(DictationParserParser.ElementsNameContext ctx) {
		String elementName = "";
		for (ParseTree child : ctx.children) {
			TerminalNode terminalNode = (TerminalNode)child;
			if(terminalNode.getSymbol().getType() != DictationParserLexer.Element)
				continue;
			
			elementName = terminalNode.getText();
			m_CurrentCommandParams.AddToElementsNamesList(elementName);
		}
	}
	
	@Override
	public void enterParameter(DictationParserParser.ParameterContext ctx){
		String parameterName = "";
		String parameterType = "";
		boolean isType = false;
		for (ParseTree child : ctx.children) {
			TerminalNode terminalNode = (TerminalNode)child;
			if(terminalNode.getSymbol().getType() == DictationParserLexer.OF_TYPE){
				isType = true;
				continue;
			}
			
			if(isType == false){
				parameterName = terminalNode.getText();
			}
			else
				parameterType = terminalNode.getText();
			
			if(parameterName.isEmpty() == false && parameterType.isEmpty() == false){
				m_CurrentCommandParams.AddToParameters(parameterName, parameterType);
				for (String Parameter : m_UnresolvedParamteres) {
					m_CurrentCommandParams.AddToParameters(Parameter, parameterType);
				}
				m_UnresolvedParamteres.clear();
				return;
			}
		}
		m_UnresolvedParamteres.add(parameterName);
	}
	// EndRegion
}