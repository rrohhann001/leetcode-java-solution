class Solution {
    public int romanToInt(String s) {

        int i=0;
        int num=0;
        while(i<s.length()){
            switch(s.charAt(i)){

                case 'I':
                if(i+1<s.length() && 'V'==s.charAt(i+1)){
                    num=4+num;
                    i++;
                    break;
                }
                if(i+1<s.length() && 'X'==s.charAt(i+1)){
                    num=9+num;
                    i++;
                    break;
                }
                num+=1;
                break;

                case 'V':
                num+=5;
                break; 

                case 'X':
                if(i+1<s.length() && 'L'==s.charAt(i+1)){
                    num=40+num;
                    i++;
                    break;
                }
                if(i+1<s.length() && 'C'==s.charAt(i+1)){
                    num=90+num;
                    i++;
                    break;
                }
                num+=10;
                break; 

                case 'L':
                num+=50;
                break; 

                case 'C':
                if(i+1<s.length() && 'D'==s.charAt(i+1)){
                    num=400+num;
                    i++;
                    break;
                }
                if(i+1<s.length() && 'M'==s.charAt(i+1)){
                    num=900+num;
                    i++;
                    break;
                }
                num+=100;
                break; 

                case 'D':
                num+=500;
                break; 

                case 'M':
                num+=1000;
                break;

            }

            i++;
        }

        return num; 
    }
}