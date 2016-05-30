/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package js_compiler.JS_COMPILERGrammar;

/**
 *
 * @author ASUS
 */
public class ConstantNode extends ExpNode{
String Type;
String Value;

	public ConstantNode(String t,String v) {
		super (null, null, t, "n");
		this.Type=t;
		this.Value=v;

	}

	@Override
	public Object Execute() {
		if(this.Type.equals("string"))
				return this.Value;
		else
				return Double.parseDouble(this.Value);
	}

        public Object getvalue(){
            return null;
        }
}
