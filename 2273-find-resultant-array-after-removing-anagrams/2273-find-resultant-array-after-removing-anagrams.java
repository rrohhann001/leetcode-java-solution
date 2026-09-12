class Solution {
    public List<String> removeAnagrams(String[] words) {


        // this is my first approch that beats 56.12% and runtime is 3ms

        // ArrayList<String> list=new ArrayList<>();
        // list.add(words[0]);

        // char[] chArr=words[0].toCharArray();
        // Arrays.sort(chArr);
        // String key=new String(chArr);

        // for(int i=1;i<words.length;i++){
        //     chArr=words[i].toCharArray();
        //     Arrays.sort(chArr);
        //     String str=new String(chArr);
        //     if(!key.equals(str)){
        //         list.add(words[i]);
        //         key=str;
        //     }
        // }
        // return list;




        //this is my second approch
        List<String> ans=new ArrayList<>();
        for(String str: words){
            if(ans.size()==0){
                ans.add(str);
            }
            boolean check=isAnagram(ans.get(ans.size()-1),str);

            if(!check){
                ans.add(str);
            }
        }
        return ans;
        
    }

    private boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}