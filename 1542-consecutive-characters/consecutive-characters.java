class Solution {
    public int maxPower(String s) {
        int count = 1;
        int maxCount = 0;
        int i = 1;
        char prev = s.charAt(0);
        while(i<s.length()){
            char curr = s.charAt(i);
            if(curr == prev){
                count++;
            }
            else{
                prev = curr;
                count=1;
            }
            maxCount = Math.max(maxCount,count);
            i++;
        }
        if(s.length()==1) return 1;
       return maxCount;         
    }
}