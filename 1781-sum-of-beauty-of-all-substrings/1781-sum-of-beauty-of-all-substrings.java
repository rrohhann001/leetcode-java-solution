class Solution {
    public int beautySum(String s) {
 
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] arr=new int[26];

            for(int j=i;j<s.length();j++){
                arr[s.charAt(j) - 'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;

                for(int k=0;k<26;k++){
                    if(arr[k]>0){
                        if(max<arr[k]){
                            max=arr[k];
                        }
                        if(min>arr[k]){
                            min=arr[k];
                        }
                    }
                }
                sum=sum+max-min;
            }
        }

        return sum;
       

        
    }
}