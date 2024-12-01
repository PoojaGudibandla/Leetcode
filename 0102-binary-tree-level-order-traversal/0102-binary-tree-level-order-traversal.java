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
//     List<List<Integer>> result;
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         result = new ArrayList<>();
//         if(root==null) return result;
//         traverse(root, 0);
//         return result;
//     }
    
//     private void traverse(TreeNode node, int level){
//         if(node == null) return;
//         if(result.size()==level){
//             result.add(new ArrayList<>());
//         }
//         result.get(level).add(node.val);
//         traverse(node.left, level+1);
//         traverse(node.right, level+1);
//     }
// }

class Solution {
  public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> result = new ArrayList<>();
    if(root==null) return result;
    Queue<TreeNode> queue= new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      int levelSize = queue.size();
      List<Integer> currentLevel = new ArrayList<>();
      for( int i=0; i<levelSize;i++){
        TreeNode current= queue.poll();
        currentLevel.add(current.val);
        if(current.left !=null){
          queue.offer(current.left);
        }
        if(current.right !=null){
          queue.offer(current.right);
        }
      }
      result.add(currentLevel);
    }
    return result;
}
}