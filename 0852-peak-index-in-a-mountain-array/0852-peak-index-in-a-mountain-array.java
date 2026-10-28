class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //brute force
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     if((i==0||arr[i-1]<arr[i])&&(i==n-1||arr[i+1]<arr[i])){
        //         return i;
        //     }
        // }
        // return 0;
        

        //optimize (binary search)
        int n=arr.length;
        int lb=0;
        int ub=n-1;
        while(lb<ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]<arr[mid+1]){
                lb=mid+1;
            }
            else{
                ub=mid;
            }
        }
        return lb;
    }
}