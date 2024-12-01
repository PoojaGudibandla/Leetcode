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
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         return root==null || isSymmetric(root.left, root.right);
//     }
//     public boolean isSymmetric(TreeNode left, TreeNode right){
//         if(left==null ||right==null)
//           return left==right;
//         if(left.val !=right.val) return false;
//         return isSymmetric(left.left, right.right) &&isSymmetric(left.right, right.left);
//     }
// }
class Solution{
     public boolean isSymmetric(TreeNode root) {
         return isMirror(root, root);
     }
    public boolean isMirror(TreeNode tree1, TreeNode tree2){
        if(tree1 == null && tree2==null)
            return true;
        if(tree1 == null || tree2==null)
            return false;
    return ((tree1.val ==tree2.val)&&isMirror(tree1.left, tree2.right)&&isMirror(tree1.right, tree2.left));
    }
    
}