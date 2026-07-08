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
     int diameter =0;
    private int maxDepth(TreeNode root) {
       
        if(root == null){
            return 0;
        }
        int right = maxDepth(root.right);
        int left = maxDepth(root.left);
         diameter= Math.max(diameter,left+right);

        return 1 + Math.max(right,left);
        }
    public int diameterOfBinaryTree(TreeNode root) {
        
        maxDepth(root);
        return diameter;
    }
     
        
}
