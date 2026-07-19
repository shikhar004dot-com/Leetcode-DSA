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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        postOrder(root,al);
        return al; 
    }
    public static void postOrder(TreeNode node,ArrayList<Integer> al){
        if(node==null){
            return ;
        }
        postOrder(node.left,al);
        postOrder(node.right,al);
        al.add(node.val);

    }
}