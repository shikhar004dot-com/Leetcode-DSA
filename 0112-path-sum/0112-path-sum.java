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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return target(root,targetSum,sum);   
    }
    public static boolean target(TreeNode node,int targetSum,int sum){
        if(node==null){
            return false;
        }
        sum+=node.val;
        if(node.left==null && node.right==null){
            if(sum==targetSum){
                return true;
            }
        }
        boolean left=target(node.left,targetSum,sum);
        boolean right=target(node.right,targetSum,sum);
        if(left){
            return true;
        }
        if(right){
            return true;
        }
        return false;
    }
}