package js_compiler.JS_COMPILERGrammar;
import js_compiler.JSParser;

public class VariableNode extends ExpNode {
    String Name;
	VarValue Vl;

	public	VariableNode(String name, VarValue vl)
	{
		super(null, null, vl.Type, "n");
		this.Name = name;
		this.Vl=vl;
	}

	public Object Execute() {      
		if (JSParser.Vars_Table.containsKey(Name))
		{
			VarValue temp = JSParser.Vars_Table.get(Name);
			if(temp.Type.equals("string"))
				return temp.Val;
			else
				return (Double.parseDouble(temp.Val));
		}
		else
		{
			 JSParser.Vars_Table.put(Name, Vl);
			 return this.Vl;
		}
	}
}
