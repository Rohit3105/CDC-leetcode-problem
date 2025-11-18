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
     List<String> ans = new ArrayList<>();
      public void helper(TreeNode root, String s){
        if(root==null) return;
        if(s.length()==0){
            s += root.val;
        }else{
            s += "->"+root.val;
        }
        if(root.left==null&&root.right==null){
            ans.add(s);
            return;
        }
        helper(root.left,s);
        helper(root.right,s);
       }
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return ans;  
    }
}