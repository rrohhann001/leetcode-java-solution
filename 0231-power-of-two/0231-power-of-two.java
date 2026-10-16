class Solution {

    public boolean isPowerOfTwo(int n) {
        //now i know bit manipulation
        return n > 0 && (n & (n - 1)) == 0;

        //     if(n<0){
        //         return false;
        //     }
        //     else{
        //         return binarySearch(0,30,n,2);
        //     }

    }

    //my first approch that theats 96.82% and 1ms runtime
    // private boolean binarySearch(int lb, int ub, int n, int base){
    //     int mid;
    //     while(lb<=ub){
    //         mid=lb+(ub-lb)/2;
    //         int pow=(int)Math.pow(2,mid);

    //         if(pow==n){
    //             return true;
    //         }

    //         else if(pow>n){
    //             ub=mid-1;
    //         }

    //         else if(pow<n){
    //             lb=mid+1;
    //         }
    //     }

    //     return false;
    // }
}