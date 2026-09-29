class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i = nums2.length-1; i>=0; i--){
            if(!st.isEmpty()){
                if(st.peek()>nums2[i]){
                    map.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }else{
                    while(!st.isEmpty()&&st.peek()<=nums2[i]){
                        st.pop();
                    }if(st.isEmpty()){
                        map.put(nums2[i],-1);
                    }else{
                         map.put(nums2[i],st.peek());
                    }
                    st.push(nums2[i]);
                   
                }
            }else{
                map.put(nums2[i],-1);
                st.push(nums2[i]);
            }
        }
        int k = 0;
        for(int i:nums1){
            if(map.containsKey(i)){
                ans[k++] = map.get(i);
            }
        }
        return ans;

        
    }
}