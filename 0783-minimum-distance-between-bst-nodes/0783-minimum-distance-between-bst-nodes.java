
class Solution {
    TreeNode temp = null;
    int min = Integer.MAX_VALUE;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(temp!=null){
            int diff = Math.abs(root.val-temp.val);
         min = Math.min(min,diff);
        }
        temp = root; 
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }
}