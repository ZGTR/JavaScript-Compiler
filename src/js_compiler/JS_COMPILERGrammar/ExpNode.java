/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package js_compiler.JS_COMPILERGrammar;

/**
 *
 * @author ASUS
 */
public  class  ExpNode extends ExpressionNode  {
    
    ExpNode Right;
	ExpNode Left;
	public String Type;
	String op;



	public ExpNode(ExpNode right, ExpNode left, String type, String op) {
		Right = right;
		Left = left;
		Type = type;
		this.op = op;
	}



	@Override
	public Object Execute() {
		if((Right.Type.equals("string"))||(Left.Type.equals("string")))
		{
			switch(this.op.charAt(0)){
			case '+':
				return Right.toString()+Left.toString();
			case '-':
				return "NAN";
			case '*':
				return "NAN";
			case '/':
				return "NAN";
			}
		}
		else

		{
			double R1=Double.parseDouble(Right.Execute().toString());
			double R2=Double.parseDouble(Left.Execute().toString());
			switch(this.op.charAt(0)){
			case '+':
				return R1+R2;
			case '-':
				return R1-R2;
			case '*':
				return R1*R2;
			case '/':
				return R1/R2;
			}
		}
		return null;
	}

    public  Object  getValue(){return null;}


}
