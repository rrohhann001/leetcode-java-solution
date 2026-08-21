class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        for(String str : words){
            if(str.contains(x+"")){
                list.add(i);
            }
            i++;
        }

        return list;
        
    }
}