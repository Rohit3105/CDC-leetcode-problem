class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int col  = encodedText.length();
        int m = col/rows;
        int t =0;
        char[][] mat = new char[rows][m];
        for(int i =0; i<rows; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = encodedText.charAt(t++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j =0; j<m; j++){
            int i =0;
            int k = j;
            while(i<rows && k<m){
                sb.append(mat[i][k]);
                i++;
                k++;
            }
        }
        String ans = sb.toString().stripTrailing();
        return ans;
    }
}