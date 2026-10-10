class Solution {
    private int getSetBits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=getSetBits(i);
        }
        return arr;

    }
}





        //this first approch that beats 19.61%and runtime 5ms
        // int[] arr=new int[n+1];
        // int temp=0;
        // int i=0;
        // while(temp<=n){
        //     int count=0;
        //     int temp2=temp;
        //     while(temp2>0){
        //         if((temp2&1)!=0){
        //             count++;
        //         }
        //         temp2>>=1;
        //     }
        //     arr[i]=count;
        //     i++;
        //     temp++;

        // }
        // return arr;