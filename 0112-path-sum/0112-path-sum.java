
class Solution {
    public boolean inorder(TreeNode root, int targetSum,int sum){
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                return true;
            }else{
                return false;
            }
        }
        boolean leftside = inorder(root.left,targetSum,sum);
        boolean rightside = inorder(root.right,targetSum,sum);
        return (leftside||rightside);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root,targetSum,0);
        
    }
}