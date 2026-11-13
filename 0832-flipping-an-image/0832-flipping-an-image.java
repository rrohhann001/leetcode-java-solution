class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows=image.length;
        int cols=image[0].length;
        for(int i=0;i<rows;i++){
            int j=0;
            int k=cols-1;
            while(j<=k){
                int temp=image[i][j]^1;
                image[i][j]=image[i][k]^1;
                image[i][k]=temp;
                j++;
                k--;
            }
        }
        return image;
        
    }
}