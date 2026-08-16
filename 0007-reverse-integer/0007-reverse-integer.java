class Solution {
    public int reverse(int x) {

        long result = 0;
        int n=x;

        while (n != 0) {

            int digit = n % 10;
            n = n / 10;

            result = result * 10 + digit;
        }

        if(x<0 && result>=Integer.MIN_VALUE){
            return (int)result;
        }

        else if(x>=0 && result<=Integer.MAX_VALUE){
            return (int)result;
        }
        
        return 0;
    }
}