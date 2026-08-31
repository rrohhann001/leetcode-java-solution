class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans=new HashMap<>();
        for(String str:strs){
            char[] ca=str.toCharArray();

            Arrays.sort(ca);

            String key=new String(ca);

            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<String>());
            }
            ans.get(key).add(str);
            
        }

        return new ArrayList<>(ans.values());
        

    }

}