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
    public TreeNode deleteNode(TreeNode root, int key) {
        return deletion(root,key);
        
    }
    public static TreeNode deletion(TreeNode node,int key){
        if(node==null){
            return null;
        }
        if(node.val>key){
            node.left=deletion(node.left,key);
        }
        else if(node.val<key){
            node.right=deletion(node.right,key);
        }
        else{
            if(node.left==null){
                return node.right;
            }
            if(node.right==null){
                return node.left;
            }
            TreeNode newRoot=min(node.right);
            node.val=newRoot.val;
            node.right=deletion(node.right,newRoot.val);
        }
        return node;
    }
    public static TreeNode min(TreeNode node){
        if(node.left==null){
            return node;
        }
        return min(node.left);
    }
}