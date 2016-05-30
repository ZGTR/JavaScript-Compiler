package js_compiler.JS_COMPILERGrammar;

import java.util.ArrayList;

public abstract class TreeNode {
	public ArrayList<TreeNode> childs = new ArrayList<TreeNode>();
    public abstract Object Execute();
    
    public void addChild(TreeNode treeNode)
    {
    	childs.add(treeNode);
    }
}
