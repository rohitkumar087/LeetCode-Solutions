class Solution {
    public boolean isAnagram(String s, String t) {
       char[] fre = new char[26];

       for(int i =0;i<s.length();i++){
        fre[s.charAt(i) - 'a']++;
       }

       for(int i=0;i<t.length();i++){
        fre[t.charAt(i) - 'a']--;
       }
       
       for(int i=0;i<26;i++){
        if(fre[i]!=0) return false;
       }
       return true;
    }
}