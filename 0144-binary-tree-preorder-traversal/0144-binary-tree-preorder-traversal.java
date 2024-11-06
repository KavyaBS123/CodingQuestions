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
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> res=new ArrayList<>();
//         preorder(root,res);
//         return res;
//     }
//     private void preorder(TreeNode node, List<Integer>res){
//  if(node==null){
//             return;
        
//     }
       
//         res.add(node.val);
//        preorder(node.left,res);
//        preorder(node.right,res);
        
//     }
// }




//iterative approach
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>preorder=new ArrayList<>();
        if(root==null){
            return preorder;
        }
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.empty()){
            root=st.pop();
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
             if (root.left != null) {
                st.push(root.left);
            }
        }
        return preorder;
    }
}