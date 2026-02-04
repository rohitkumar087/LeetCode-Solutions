class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            } 
        }
        int n = matrix.length;
      for(int i=0;i<n;i++){
        int j = 0;
        int k = n-1;
        while(j<k){
            int temp = matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k] = temp;
            j++;
            k--;
        }
      }  
    } 
}