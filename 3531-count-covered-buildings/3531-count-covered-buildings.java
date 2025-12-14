class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer,Integer> minrow = new HashMap<>();
        Map<Integer,Integer> maxrow = new HashMap<>();
        Map<Integer,Integer> mincol = new HashMap<>();
        Map<Integer,Integer> maxcol = new HashMap<>();
        for(int[] b:buildings){
            int r = b[0];
            int c = b[1];
            minrow.put(c,Math.min(minrow.getOrDefault(c,r),r));
            maxrow.put(c,Math.max(maxrow.getOrDefault(c,r),r));
            mincol.put(r,Math.min(mincol.getOrDefault(r,c),c));
            maxcol.put(r,Math.max(maxcol.getOrDefault(r,c),c));
        }
        int count = 0;
        for(int[] b : buildings){
            int r = b[0];
            int c = b[1];
            if(minrow.get(c)<r&&maxrow.get(c)>r&&mincol.get(r)<c&&maxcol.get(r)>c){
                count++;
            }
        }
        return count;
    }
}