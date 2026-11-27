class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch) && distance[ch-'a']!=i-1-map.get(ch)){
                return false;
            }
            map.put(ch,i);
        }
        return true;
        
    }
}