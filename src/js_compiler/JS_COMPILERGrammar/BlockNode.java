package js_compiler.JS_COMPILERGrammar;

public class BlockNode extends TreeNode {

public BlockNode() {

}

public Object Execute(){
    for(TreeNode child : childs)
	 child.Execute();
	return null;
 }

}
