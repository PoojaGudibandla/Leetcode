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
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> inorderTree = new ArrayList();
      inorderTraversal(root, inorderTree);
      return inorderTree;
    }
   public void inorderTraversal(TreeNode root, List inorderTree){
        if(root == null)
          return ;
 
   
      inorderTraversal(root.left, inorderTree);
      inorderTree.add(root.val);
      inorderTraversal(root.right, inorderTree);
      
    }
    
    
}