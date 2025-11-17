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
     int preindex = 0;
     Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {  
        for(int i =0; i<inorder.length; i++){
            map.put(inorder[i],i);
           
        }

         return Build(preorder,0,inorder.length-1);
    }
    public TreeNode Build(int[] preorder, int istart, int iend){
        if(istart>iend) return null;
        int rootval = preorder[preindex++];
        TreeNode root = new TreeNode(rootval);
        int mid = map.get(rootval);
        root.left = Build(preorder,istart,mid-1);
        root.right = Build(preorder,mid+1,iend);
        return root;
    }
}