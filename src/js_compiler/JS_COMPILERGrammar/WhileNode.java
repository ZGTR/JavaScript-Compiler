/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package js_compiler.JS_COMPILERGrammar;

/**
 *
 * @author ASUS
 */

public class WhileNode extends TreeNode {

    public WhileNode() {
	}

    @Override

	public Object Execute() {
		// TODO Auto-generated method stub
		while((Boolean)this.childs.get(0).Execute())
		{
			childs.get(1).Execute();
		}
		return null;
	}

}
