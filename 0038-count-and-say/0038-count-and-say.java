class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String rleStr=countAndSay(n-1);
        int size=rleStr.length();
        StringBuilder newRleStr=new StringBuilder();

        int i=0;
        while(i<size){
            int j=i+1;
            while(j<size && rleStr.charAt(j)==rleStr.charAt(i)){
                j++;
            }
            int diff=j-i;
            newRleStr.append(diff);
            newRleStr.append(rleStr.charAt(i));
            i=j;
        }

        return newRleStr.toString();
        
    }
}