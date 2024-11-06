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
 //recursive approach 
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer>res=new ArrayList<>();
//         inorder(root,res);
//         return res;
//     }
//     private void inorder(TreeNode node, List<Integer>res){
//         if(node==null){
//             return;
//         }
//         inorder(node.left,res);
//         res.add(node.val);
//         inorder(node.right,res);
//     }
// }
//Iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>inorder=new ArrayList<>();
        if(root==null){
            return inorder;
        }
        Stack<TreeNode> st=new Stack<>();
       while(root!=null || !st.isEmpty()){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
        root=st.pop();
        inorder.add(root.val);
        root=root.right;
       }
       return inorder;
    }
}