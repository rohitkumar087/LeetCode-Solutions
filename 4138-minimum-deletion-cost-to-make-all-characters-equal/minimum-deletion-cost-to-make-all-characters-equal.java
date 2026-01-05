class Solution {
    public long minCost(String s, int[] cost) {
        int n = s.length();
        long min = Long.MAX_VALUE;
        for(char c='a';c<='z';c++){
            long cst = 0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(c!=ch){
                    cst += cost[i];
                }
            }
            min = Math.min(min,cst);
        }
        return min;
    }
}