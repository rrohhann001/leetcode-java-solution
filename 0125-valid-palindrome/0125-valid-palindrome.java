class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toLowerCase().toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]<48 || arr[i]>57 && arr[i]<97 || arr[i]>122){
                i++;
            }
            else if(arr[j]<48 || arr[j]>57 &&arr[j]<97 || arr[j]>122){
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