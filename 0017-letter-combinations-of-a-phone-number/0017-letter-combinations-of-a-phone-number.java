class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0){
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();

        String[] stringArr={"", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int index=0;

        solve("", digits, index, list, stringArr);
        return list;
    }

    private void solve(String combination, String digits, int index, List<String> list, String[] stringArr){

        if(index>=digits.length()){
            list.add(combination);
        }

        else{
            int number=digits.charAt(index)-'0';
            String value=stringArr[number];

            for(char letter : value.toCharArray()){
                solve(combination+letter,digits,index+1,list,stringArr);
            }
        }
    }

}