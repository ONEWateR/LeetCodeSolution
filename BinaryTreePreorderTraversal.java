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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	preorderTraversal(root, result);
    	return result;
    	
    }
    public void preorderTraversal(TreeNode root,ArrayList<Integer> list){
    	if (root == null) return;
    	list.add(root.val);
    	preorderTraversal(root.left,list);
    	preorderTraversal(root.right,list);
    }
}
