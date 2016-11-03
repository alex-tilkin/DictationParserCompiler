import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandParams {
	// Region - Fields
	private CommandType m_CommandType = CommandType.None;
	private Type m_Type = Type.None;
	private boolean m_IsAbstract = false;
	private boolean m_IsStatic = false;
	private boolean m_IsInner = false;
	private boolean m_IsFinal = false;
	private boolean m_IsTransient = false;
	private boolean m_IsVolatile;
	private String m_ElementType;
	private AccessLevel m_AccessLevel = AccessLevel.None;
	private List<String> m_ElementsNames = new ArrayList<String>();
	private Map<String, String> m_Parameters = new HashMap<String, String>();
	// EndRegion
	
	// Region - Enums
	public enum CommandType{
		None,
		Create
	}
	
	public enum Type{
		None,
		Class,
		Enum,
		Interface, 
		Field, 
		Method
	}
	
	public enum AccessLevel{
		None,
		Private,
		Public,
		Protected
	}
	// EndRegion
	
	// Region - Public Methods
	public CommandType getCommandType() {
		return m_CommandType;
	}

	public void AddToElementsNamesList(String elementName) {
		m_ElementsNames.add(elementName);
	}
	
	public void setCommandType(CommandType m_CommandType) {
		this.m_CommandType = m_CommandType;
	}

	public Type getType() {
		return m_Type;
	}

	public void setType(Type m_Type) {
		this.m_Type = m_Type;
	}

	public boolean isIsAbstract() {
		return m_IsAbstract;
	}

	public void setIsAbstract(boolean m_IsAbstract) {
		this.m_IsAbstract = m_IsAbstract;
	}

	public boolean isIsStatic() {
		return m_IsStatic;
	}

	public void setIsStatic(boolean m_IsStatic) {
		this.m_IsStatic = m_IsStatic;
	}

	public AccessLevel getAccessLevel() {
		return m_AccessLevel;
	}

	public void setAccessLevel(AccessLevel m_AccessLevel) {
		this.m_AccessLevel = m_AccessLevel;
	}

	public boolean IsInner() {
		return m_IsInner;
	}

	public void setIsInner(boolean isInner) {
		m_IsInner = isInner;
	}
	
	public void setIsFinal(boolean isFinal) {
		m_IsFinal = isFinal;
	}

	public void setIsTransient(boolean isTransient) {
		m_IsTransient = isTransient;
	}

	public void setIsVolatile(boolean isVolatile) {
		m_IsVolatile = isVolatile;
	}

	public void setElementType(String elementType) {
		m_ElementType = elementType;
	}
	
	public void AddToParameters(String parameterName, String parameterType) {
		m_Parameters.put(parameterName, parameterType);
	}
	// EndRegion
}