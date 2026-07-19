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
        ArrayList<Integer> al= new ArrayList<>();
        inOrder(root,al);
        return al;   
    }
    public static void inOrder(TreeNode node,ArrayList<Integer> al){
        if(node==null){
            return;
        }
        inOrder(node.left,al);
        al.add(node.val);
        inOrder(node.right,al);
    }
}