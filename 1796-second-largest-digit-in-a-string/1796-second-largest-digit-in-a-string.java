class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr=new ArrayList<>();
        int firstLargest=-1;
        int secondLargest=-1;
        int j=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch<'a'){
                arr.add(ch-'0');
                j++;

                if(arr.get(j)>firstLargest){
                    secondLargest=firstLargest;
                    firstLargest=arr.get(j);
                }
                else if(arr.get(j)>secondLargest && arr.get(j)<firstLargest){
                    secondLargest=arr.get(j);
                }
            }
            
            // switch(s.charAt(i)){
            //     case '0':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '1':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '2':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '3':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '4':
            //     arr.add(s.charAt(i) -'0');
            //     break;
                
            //     case '5':
            //     arr.add(s.charAt(i) -'0');
            //     break;
                
            //     case '6':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '7':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '8':
            //     arr.add(s.charAt(i) -'0');
            //     break;

            //     case '9':
            //     arr.add(s.charAt(i) -'0');
            //     break;
            // }
        }
        if(arr.size()==0){
            return -1;
        }
        
        return secondLargest;
    }
}