class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int temp=0;
        int i=0;
        while(temp<=n){
            int count=0;
            int temp2=temp;
            while(temp2>0){
                if((temp2&1)!=0){
                    count++;
                }
                temp2>>=1;
            }
            arr[i]=count;
            i++;
            temp++;

        }
        return arr;
    }
}