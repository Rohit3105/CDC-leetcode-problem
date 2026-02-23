import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();
        //insert to correct position
        boolean insert = false;
        for(int i=0;i<intervals.length;i++)
        {
            if(insert==false && intervals[i][0]>=newInterval[0])
            {
                arr.add(newInterval);
            }
            arr.add(new int[]{intervals[i][0],intervals[i][1]});
        } 
        if(insert==false)
            arr.add(newInterval);
            
        //merge
        int[][] insertArr = arr.toArray(new int[arr.size()][]);
        ArrayList<int[]> res = new ArrayList<>();
        int start1 = insertArr[0][0];
        int end1 = insertArr[0][1];
        int k=0;
        for(int i=1; i<insertArr.length; i++)
        {
            int start2=insertArr[i][0];
            int end2=insertArr[i][1];
            if(end1>=start2)
            {
                end1 = Math.max(end1,end2);
                continue;
            }
                res.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}