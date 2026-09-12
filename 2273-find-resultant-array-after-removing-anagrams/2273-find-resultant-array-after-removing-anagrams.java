class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        list.add(words[0]);

        char[] chArr=words[0].toCharArray();
        Arrays.sort(chArr);
        String key=new String(chArr);
        
        for(int i=1;i<words.length;i++){
            chArr=words[i].toCharArray();
            Arrays.sort(chArr);
            String str=new String(chArr);
            if(!key.equals(str)){
                list.add(words[i]);
                key=str;
            }
        }
        return list;
        
    }
}