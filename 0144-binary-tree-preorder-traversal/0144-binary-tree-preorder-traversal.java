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
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> preorderTree = new ArrayList();
      preorderTraversal(root, preorderTree);
      return preorderTree;
    }
   public void preorderTraversal(TreeNode root, List preorderTree){
        if(root == null)
          return ;
 
      preorderTree.add(root.val);
      preorderTraversal(root.left, preorderTree);
      preorderTraversal(root.right, preorderTree);
      
    }
    
    
}