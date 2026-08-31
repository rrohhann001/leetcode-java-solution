class Solution {
    public int secondHighest(String s) {
        int firstLargest=-1;
        int secondLargest=-1;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';

            if(digit<10){

                if(digit>firstLargest){
                    secondLargest=firstLargest;
                    firstLargest=digit;
                }
                else if(digit>secondLargest && digit<firstLargest){
                    secondLargest=digit;
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
        
        return secondLargest;
    }
}