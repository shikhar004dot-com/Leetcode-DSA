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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0;
        return make(preorder,Integer.MAX_VALUE);
        
    }
    public TreeNode make(int pre[],int b){
        if(i==pre.length || pre[i]>b){
            return null;
        }
        TreeNode node=new TreeNode(pre[i++]);
        node.left=make(pre,node.val);
        node.right=make(pre,b);
        return node;

    }
}