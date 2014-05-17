public class Solution {
	public class Depth {
		public int depth;
	}

	public boolean isBalanced(TreeNode root) {
		return isBalanced(root, new Depth()); 
	}

	public boolean isBalanced(TreeNode root, Depth d) {
		if (root == null){
			d.depth = 0;
			return true;
		}
		Depth leftDepth = new Depth();
		Depth rightDepth = new Depth();
		if (isBalanced(root.left, leftDepth) && isBalanced(root.right, rightDepth)){
			int diff = Math.abs(leftDepth.depth - rightDepth.depth);
			if (diff <= 1){
				d.depth = 1 + (Math.max(leftDepth.depth, rightDepth.depth));
				return true;
			}
		}
		return false;
	}
}
