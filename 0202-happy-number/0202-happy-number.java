class Solution {
    public boolean isHappy(int n) {
        long ans=n;
        int count=0;
        while(ans!=1){
            long digit=0;
            long res=0;

            while(ans!=0){
                digit=ans%10;
                ans=ans/10;
                res=digit*digit+res;
                if(res>Integer.MAX_VALUE){
                    return false;
                }
            }
            count++;
            if(res>1 && res<10&& count>1){
                return false;
            }
            ans=res;
        }
       return true;
        
    }
}