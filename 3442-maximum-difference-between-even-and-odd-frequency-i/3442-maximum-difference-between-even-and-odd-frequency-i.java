class Solution {
    public int maxDifference(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int oddMax=0;
        int evenMin=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            int num=arr[i];
            if(num%2!=0 && num>oddMax){
                oddMax=num;
            }

            if(num!=0 && num%2==0&&num<evenMin){
                evenMin=num;
            }

        }

        return (oddMax-evenMin);
        
        
    }
}