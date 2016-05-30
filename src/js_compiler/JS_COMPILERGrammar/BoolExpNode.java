/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package js_compiler.JS_COMPILERGrammar;

/**
 *
 * @author ASUS
 */
public class BoolExpNode extends ExpNode{


	public BoolExpNode(ExpNode right, ExpNode left, String op) {
		super(right, left, null, op);

	}



	public Object Execute() {
		if(this.Right.Type=="double")
		{
			if(this.op==">")
				return (Double.parseDouble(Right.Execute().toString())>Double.parseDouble(Left.Execute().toString()));
			if(this.op=="<")
				return (Double.parseDouble(Right.Execute().toString())<Double.parseDouble(Left.Execute().toString()));
			if(this.op==">=")
				return (Double.parseDouble(Right.Execute().toString())>=Double.parseDouble(Left.Execute().toString()));
			if(this.op=="<=")
				return (Double.parseDouble(Right.Execute().toString())<=Double.parseDouble(Left.Execute().toString()));
			if(this.op=="==")
				return (Double.parseDouble(Right.Execute().toString())==Double.parseDouble(Left.Execute().toString()));
			if(this.op=="!=")
				return (Double.parseDouble(Right.Execute().toString())!=Double.parseDouble(Left.Execute().toString()));
		}
		if((this.Right.Type=="string")||(this.Left.Type=="string"))
		{
			if(this.op==">")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))>0)
					return true;
				else
					return false;
			}
			if(this.op=="<")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))<0)
					return true;
				else
					return false;
			}

			if(this.op==">=")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))>=0)
					return true;
				else
					return false;
			}
			if(this.op=="<=")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))<=0)
					return true;
				else
					return false;
			}
			if(this.op=="==")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))==0)
					return true;
				else
					return false;
			}
			if(this.op=="!=")
			{
				if ((Right.Execute().toString().compareTo(Left.Execute().toString()))!=0)
					return true;
				else
					return false;
			}
		}
		return null;
	}
}
