class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int st = 0;
        for( int i =1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                return false;
            }if(arr[i]<arr[i-1]){
                st = i;
                break;
            }
        }
        if(st==-1 || st==1||st==arr.length) return false;
        for(int j =st; j<arr.length-1; j++){
            if(arr[j]<=arr[j+1]){
                return false;
            }
        }
        return true;
        
    }
}