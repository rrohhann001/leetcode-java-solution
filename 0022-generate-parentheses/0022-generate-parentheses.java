class Solution {
    private List<String> list;
    private int n;
    private char[] str;

    public List<String> generateParenthesis(int n) {

        this.list=new ArrayList<>();
        this.n=n;
        this.str=new char[n*2];
        generateString(0, 0, 0);
        return list;
    }

    public void generateString(int open, int close, int index ){
        if(open==n && close==n){
            list.add(new String(str));
            return;
        }

        if(open<n){
            str[index]='(';
            generateString(open+1,close, index+1);
        }

        if(close<open){
            str[index]=')';
            generateString(open,close+1, index+1);
        }

    }
}