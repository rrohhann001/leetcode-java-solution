class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch<'a'){
                arr.add(ch-'0');
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
        int firstLargest=arr.get(0);
        int secondLargest=-1;
        for(int i=0;i<arr.size();i++){

            if(arr.get(i)>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr.get(i);
            }
            else if(arr.get(i)>secondLargest && arr.get(i)<firstLargest){
                secondLargest=arr.get(i);
            }
        }

        return secondLargest;
    }
}