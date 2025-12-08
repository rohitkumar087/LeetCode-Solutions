class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--) {
			rev+=s1.charAt(i);
		}
		
        return s1.equals(rev);
    }    
}