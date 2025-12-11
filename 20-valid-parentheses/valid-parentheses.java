class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> hs = new HashMap<>();
        hs.put(')','(');
        hs.put('}','{');
        hs.put(']','[');
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                char cb  = hs.get(ch);
                if(!st.isEmpty() && cb == st.peek()){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;
        
    }
}