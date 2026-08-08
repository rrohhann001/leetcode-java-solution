class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if(digits.length()==0){
            return list;
        }

        String[] stringArr={"", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder currentStr=new StringBuilder(); 

        solve(currentStr, digits, 0, list, stringArr);
        return list;
    }

    private void solve(StringBuilder currentStr, String digits, int index, List<String> list, String[] stringArr){

        if(index>=digits.length()){
            list.add(currentStr.toString());
        }

        else{
            int number=digits.charAt(index)-'0';
            String value=stringArr[number];

            for(int i=0;i<value.length();i++){

                char selectedChar = value.charAt(i);

                currentStr.append(selectedChar);

                solve(currentStr,digits,index+1,list,stringArr);
                currentStr.deleteCharAt(currentStr.length() - 1);
            }
        }
    }

}