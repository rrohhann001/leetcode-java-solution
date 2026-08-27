class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toLowerCase().toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]<'0' || arr[i]>'9' && arr[i]<'a' || arr[i]>'z'){
                i++;
            }
            else if(arr[j]<'0' || arr[j]>'9' &&arr[j]<'a' || arr[j]>'z'){
                j--;
            }
            else if(arr[i]!=arr[j]){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;  
    }
}