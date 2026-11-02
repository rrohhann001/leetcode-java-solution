class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        n--;
        int a=0;
        int b=1;
        int c;
        while(n>0){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return b;
        
    }
}