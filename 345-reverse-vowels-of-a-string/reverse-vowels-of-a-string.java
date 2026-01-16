class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();   
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            char ch1 = arr[start];
            char ch2 = arr[end];

            boolean v1 = (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'
                       || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U');

            boolean v2 = (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'
                       || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U');

            if (v1 && v2) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;        
                end--;
            } else if (!v1) {
                start++;        
            } else {
                end--;          
            }
        }

        return new String(arr);  
    }
}
