class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //brute force
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i==0||arr[i-1]<arr[i])&&(i==n-1||arr[i+1]<arr[i])){
                return i;
            }
        }
        return 0;
        
    }
}