class Solution {
    public int mySqrt(int x) {

        
        long lb=1;
        long ub=x/2;
        long mid=0;

        while(lb<=ub){
            mid=lb+(ub-lb)/2;

            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
               lb=mid+1;
            }
            else if(mid*mid>x){
                ub=mid-1;
            }
        }

        return (int)ub;  
    }
}