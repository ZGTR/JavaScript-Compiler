package js_compiler.JS_COMPILERGrammar;
import java.io.ObjectInputStream.GetField;

import js_compiler.JSParser;
public class AssignmentNode extends  ExpressionNode  {
	String Left;
    ExpNode Right;
    String op;
    boolean b;

    public AssignmentNode(String left, ExpNode right,String op,boolean b) {
		//super();
		this.Left = left;
		this.Right = right;
		this.op=op;
		this.b=b;
	}
    
    public Object Execute() {
		String sR;
		VarValue vr = null;
		if(Right==null)
		{
			 if(this.op.equals("++"))
			{
				 if(JSParser.Vars_Table.get(Left)!=null)

				 {
				 if(JSParser.Vars_Table.get(Left).Type.equals("string"))
					{
						throw new RuntimeException();
					}
					else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
					{
						Double d=Double.parseDouble(JSParser.Vars_Table.get(Left).Val)+1;
						vr=new VarValue("double", d.toString());
						JSParser.Vars_Table.put(Left, vr);
						if(b)
							return d;
						else
							return d-1;
					}
				 }
				 else throw new RuntimeException();
				}


			 else if(this.op.equals("--"))
			{
				if(JSParser.Vars_Table.get(Left)!=null)
				{
					if(JSParser.Vars_Table.get(Left).Type.equals("string"))
					{
						throw new RuntimeException();
					}
					else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
					{
						Double d=Double.parseDouble(JSParser.Vars_Table.get(Left).Val)-1;
						vr=new VarValue("double", d.toString());
						JSParser.Vars_Table.put(Left, vr);
						if(b)
							return d;
						else
							return d+1;
					}
				}
				else throw new RuntimeException();
			}

		}

		else if(Right.Type.equals("string"))
		{
			sR=Right.Execute().toString();


			if(this.op.equals("="))
				vr=new VarValue("string", sR);
			else if(this.op.equals("+="))
			{
				sR=sR+JSParser.Vars_Table.get(Left).Val.toString();
				vr=new VarValue("string", sR);
			}
			else
				throw new RuntimeException();


		}
		else
		{
			sR=Right.Execute().toString();
			if(this.op.equals("="))
				vr=new VarValue("double", sR);

			else if(this.op.equals("+="))
			{
				if(JSParser.Vars_Table.get(Left).Type.equals("string"))
				{
					sR=sR+JSParser.Vars_Table.get(Left).Val.toString();
					vr=new VarValue("string", sR);
				}
				else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
				{
					Double d=Double.parseDouble(sR)+Double.parseDouble(JSParser.Vars_Table.get(Left).Val);
					vr=new VarValue("double", d.toString());
				}

			}



			else if(this.op.equals("*="))
			{
				if(JSParser.Vars_Table.get(Left).Type.equals("string"))
				{
					throw new RuntimeException();
				}
				else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
				{
					Double d=Double.parseDouble(sR)*Double.parseDouble(JSParser.Vars_Table.get(Left).Val);
					vr=new VarValue("double", d.toString());
				}

			}


			else if(this.op.equals("/="))
			{
				if(JSParser.Vars_Table.get(Left).Type.equals("string"))
				{
					throw new RuntimeException();
				}
				else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
				{
					Double d=Double.parseDouble(sR)/Double.parseDouble(JSParser.Vars_Table.get(Left).Val);
					vr=new VarValue("double", d.toString());
				}

			}



			else if(this.op.equals("-="))
			{
				if(JSParser.Vars_Table.get(Left).Type.equals("string"))
				{
					throw new RuntimeException();
				}
				else	if(JSParser.Vars_Table.get(Left).Type.equals("double"))
				{
					Double d=Double.parseDouble(sR)-Double.parseDouble(JSParser.Vars_Table.get(Left).Val);
					vr=new VarValue("double", d.toString());
				}

			}
		}
		JSParser.Vars_Table.put(Left, vr);
		return null;
	}
public Object getValue ()
{
		return null ;
	}

}
