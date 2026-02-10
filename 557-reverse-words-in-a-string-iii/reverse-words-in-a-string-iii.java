class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder("");

        for(int i=0;i<arr.length;i++){
            StringBuilder val = new StringBuilder(arr[i]);
            ans.append(val.reverse());
            if(i+1!=arr.length)
            {
                ans.append(" ");
            } 
        }

        return ans.toString();
    }
}