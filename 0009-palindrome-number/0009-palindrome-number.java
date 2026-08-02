class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int rev=0;
        int value=x;

        while(value!=0){

            rev=(value%10)+rev*10;
            value=value/10;

        }

        if(rev==x){
            return true;
        } else{
            return false;
        }
        
    }
}