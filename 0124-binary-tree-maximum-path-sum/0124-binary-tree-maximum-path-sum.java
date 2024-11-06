/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int maxvalue[]=new int[1];
        maxvalue[0]=Integer.MIN_VALUE;
        maxpathdown(root,maxvalue);
        return maxvalue[0];
    }
    private int maxpathdown(TreeNode node, int maxvalue[]){
        if(node==null) return 0;
        int left=Math.max(0,maxpathdown(node.left,maxvalue));
        int right=Math.max(0,maxpathdown(node.right,maxvalue));
maxvalue[0]=Math.max(maxvalue[0], left+right+node.val);
return Math.max(left,right)+node.val;
    }
}