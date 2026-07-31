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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al= new ArrayList<>();
        right(root,0,al);
        return al;
    }
    public static void right(TreeNode node,int d,ArrayList<Integer> al){
        if(node==null){
            return ;
        }
        if(d==al.size()){
            al.add(node.val);
        }  
        right(node.right,d+1,al);  
        right(node.left,d+1,al);

    }
}