
class Solution {
    public int height(TreeNode root){
    if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nthlevel(TreeNode root,int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nthlevel(root.left,n-1,arr);
        nthlevel(root.right,n-1,arr);
    }
     public void nthlevel2(TreeNode root,int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nthlevel2(root.right,n-1,arr);
        nthlevel2(root.left,n-1,arr);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int h = height(root);
        for(int level =1; level<=h; level++){
            List<Integer> arr = new ArrayList<>();
            if(level%2==1) nthlevel(root,level,arr);
            else nthlevel2(root,level,arr);
             ans.add(arr);
        }
       
        return ans;

        
    }
}