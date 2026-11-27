class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n=s.length();
        for(int i=0;i<n;i++){
            int d=distance[s.charAt(i)-'a'];
            if(i+d+1>=n || s.charAt(i+d+1)!=s.charAt(i)){
                return false;
            }
            distance[s.charAt(i) - 'a'] = -1;
        }
        return true;







        //my first approch that beats 27.82% and runtime 2ms(O(n) time and O(n) space)

        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(map.containsKey(ch) && distance[ch-'a']!=i-1-map.get(ch)){
        //         return false;
        //     }
        //     map.put(ch,i);
        // }
        // return true;
        
    }
}