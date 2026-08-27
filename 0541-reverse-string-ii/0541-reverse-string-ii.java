class Solution {
    private static void reverse(int i, int j, char[] arr){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0;
        int n=arr.length;
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(i,j,arr);
            i=i+2*k;
        }
        return new String(arr);
        
    }
}