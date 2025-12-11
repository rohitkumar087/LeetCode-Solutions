class Solution {
    public boolean isAnagram(String s, String t) {
       char[] fre = new char[26];

       for(char ch : s.toCharArray()) fre[ch-'a']++;
       for(char ch : t.toCharArray()) fre[ch-'a']--;

       for(char n : fre){
        if(n != 0) return false;
       }
       return true;
    }
}