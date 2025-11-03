class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for(int[] g : guards){
            grid[g[0]][g[1]] = 2;
        }
        for(int[] w : walls){
            grid[w[0]][w[1]]= 2;
        }
        int[] dr = {-1,0,1,0};
        int [] dc = {0,1,0,-1};

        for(int[] d : guards){
            int r = d[0];
            int c = d[1];

            for(int i =0; i<4; i++){
                int nr = r+dr[i];
                int nc = c+dc[i];

                while(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]!=2){
                    if(grid[nr][nc]==0){
                        grid[nr][nc]=1;
                    }
                    nr += dr[i];
                    nc += dc[i];
                }
            }
        }
        int count =0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return count;

        
    }
}