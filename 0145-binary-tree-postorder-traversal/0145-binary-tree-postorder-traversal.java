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
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer>res=new ArrayList<>();
// postorder(root,res);
// return res;
//     }
//     private void postorder(TreeNode node, List<Integer>res){
//         if(node==null){
//             return;
//         }
//         postorder(node.left,res);
//         postorder(node.right,res);
//         res.add(node.val);
//     }
// }


// using 2 stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>postorder=new ArrayList<>();
        if(root==null){
            return postorder;
        }
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>st2=new Stack<>();
st1.push(root);
while(!st1.empty()){
    root=st1.pop();
    st2.push(root);
    if(root.left!=null){
        st1.push(root.left);
    }
    if(root.right!=null){
        st1.push(root.right);
    }
}
while(!st2.empty()){
    postorder.add(st2.pop().val);
}
return postorder;
    }
}