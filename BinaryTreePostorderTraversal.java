/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	postorderTraversal(root, result);
    	return result;
    	
    }
    public void postorderTraversal(TreeNode root,ArrayList<Integer> list){
    	if (root == null) return;
    	postorderTraversal(root.left,list);
    	postorderTraversal(root.right,list);
    	list.add(root.val);
    }
}
