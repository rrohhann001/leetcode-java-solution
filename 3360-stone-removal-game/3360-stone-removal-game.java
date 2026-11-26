class Solution {
    public boolean canAliceWin(int n) {
        int temp=10;
        while((n-temp)>=0){
            n=n-temp;
            temp--;
        }
        return temp%2!=0;

        
    }
}