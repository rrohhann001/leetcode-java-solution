class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            long temp;
            if(height[i]<=height[j]){
                temp=height[i];
                i++;
            }
            else{
                temp=height[j];
                j--;
            }
            temp=temp*((j-i)+1);
            if(max<temp){
                max=(int)temp;
            }
        }
        return max;
        
    }
}