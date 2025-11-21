class Solution {
    ArrayList<List<Integer>> result = new ArrayList<>();
    void fill(TreeNode root, int targetSum,int sum, List<Integer> arr){
        if(root==null) return;
        sum += root.val;
         ArrayList<Integer> newArr = new ArrayList<>(arr);  // FIX: new variable name
        newArr.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                 result.add(newArr);
            }else{
                return;
            }
           
        }
        fill(root.left,targetSum,sum,newArr);
        fill(root.right,targetSum,sum,newArr);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;
        fill(root,targetSum,sum,new ArrayList<>());
        return result;   
    }
}