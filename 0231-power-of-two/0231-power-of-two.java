class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<0){
            return binarySearch(0,31,n,-2);
        }

        else{
            return binarySearch(0,30,n,2);
        }
        
    }

    private boolean binarySearch(int lb, int ub, int n, int base){
        int mid;
        while(lb<=ub){
            mid=lb+(ub-lb)/2;
            int pow=(int)Math.pow(2,mid);

            if(pow==n){
                return true;
            }

            else if(pow>n){
                ub=mid-1;
            }

            else if(pow<n){
                lb=mid+1;
            }
        }

        return false;
    }
}