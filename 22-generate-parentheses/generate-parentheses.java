class Solution {
    void function(int n ,int o,int c,StringBuilder s,List<String> ans){
        if(o == n && c == n){
            ans.add(s.toString());
            return;
        }

        if(o < n){
            s.append('(');
            function(n,o+1,c,s,ans);
            s.deleteCharAt(s.length()-1);
        }

        if(c < o){
            s.append(')');
            function(n,o,c+1,s,ans);
            s.deleteCharAt(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        function(n,0,0,s,ans);
        return ans;

    }
}