class Solution {
    public int mySqrt(int x) {

        
        long lb=1;
        long length=100;
        long ub=length;
        long mid=0;

        while(lb<=ub){
            mid=lb+(ub-lb)/2;

            if(length<=46400 && length*length<x){
                length=length+100;
                lb=ub+1;
                ub=length;
                
            }
            else if(mid*mid==x){
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