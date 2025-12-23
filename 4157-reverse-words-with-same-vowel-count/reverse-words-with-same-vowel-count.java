class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int firstCount = 0;
        String word = arr[0];
        for(int j=0;j<word.length();j++){
            char ch = word.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                firstCount++;
            }
        }
    
        for(int i=1;i<arr.length;i++){
            String word1 = arr[i];
            int count = 0;
            for(int j=0;j<word1.length();j++){
            char ch = word1.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                    count++;
                }
            }
            if(firstCount == count){
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        String ans = String.join(" ", arr);
        return ans;
    }
}