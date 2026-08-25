class Solution {
    public int maxFreqSum(String s) {
      int[] freqVowel=new int[26];
      int[] freqConso=new int[26];

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            freqVowel[ch-'a']++;
        }
        else{
            freqConso[ch-'a']++;
        }
      }
      int maxVowelFreq=0;
      int maxConsoFreq=0;
      for(int i=0;i<26;i++){
        if(maxVowelFreq<freqVowel[i]){
            maxVowelFreq=freqVowel[i];
        }
        if(maxConsoFreq<freqConso[i]){
            maxConsoFreq=freqConso[i];
        }
      }

      return maxVowelFreq+maxConsoFreq;
        
    }
}