
package js_compiler.JS_COMPILERGrammar;

public class IfNode extends TreeNode {
	public IfNode() {
		super();
	}
	
	@Override
	public Object Execute() {
		if((Boolean)(childs.get(0).Execute()))
		{
			childs.get(1).Execute();
		}
		else 
			if(childs.get(2)!=null)
				childs.get(2).Execute();
		return null;
	}
 }


