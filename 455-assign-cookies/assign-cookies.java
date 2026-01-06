class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(s);
        Arrays.sort(g);
        if(s.length==0 || g.length==0 ) return 0;
        int j = 0;
        int ans = 0;
        for(int i=0;i<g.length;){
            if(s[j]>=g[i]){
                ans++;
                i++;
            }
            j++;
            if(j==s.length) break;
        }
        return ans;
    }
}