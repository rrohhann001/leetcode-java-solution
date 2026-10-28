/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //brute force
        // time limit exceed
        // for(int i=1;i<=n;i++){
        //     if(isBadVersion(i)){
        //         return i;
        //     }
        // }
        // return 1;

        //optimize
        int lb=1;
        int ub=n;
        while(lb<ub){
            int mid=lb+(ub-lb)/2;
            if(isBadVersion(mid)){
                ub=mid;
            }
            else{
                lb=mid+1;
            }
        }
        return lb;
        //return ub;

        
    }
}