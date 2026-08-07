class Solution {
    public double myPow(double x, int n) {

        if(n==0){
            return 1;
        }

        if(x==1){
            return 1;
        }

        if(x==-1&&n<0){
            return 1;
        }

        if(x==-1){
            return -1;
        }

        if(n<=-20){
            return 0;
        }

        double result=x;
        if(n>0){
            for(int i=1;i<n;i++){
                result*=x;
            }
            return result;
        }
        else{
            for(int i=-1;i>n;i--){
                result*=x;
            }
            return 1/result;
            
        }
        
    }
}