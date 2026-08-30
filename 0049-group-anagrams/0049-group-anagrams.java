class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<List<String>>();
        }

        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("-1")){
                continue;
            }
            List<String> list=new ArrayList<>();
            for(int j=i+1;j<strs.length;j++){
                if(!strs[j].equals("-1") && anagram(strs[i],strs[j])){
                    list.add(strs[j]);
                    strs[j]="-1";
                }
            }
            list.add(strs[i]);
            strs[i]="-1";
            
            if(!list.isEmpty()){
                ans.add(list);
            }
        }

        return ans;
        

    }

    private boolean anagram(String s, String t){
        if(s.length()!=t.length()){return false;}
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<0){
                return false;
            }
        }

        return true;
    }
}