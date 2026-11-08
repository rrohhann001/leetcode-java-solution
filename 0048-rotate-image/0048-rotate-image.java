class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<cols;i++){
            int j=0;
            int k=rows-1;
            while(j<k){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[k][i];
                matrix[k][i]=temp;
                k--;
                j++;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<rows;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       
    }
}