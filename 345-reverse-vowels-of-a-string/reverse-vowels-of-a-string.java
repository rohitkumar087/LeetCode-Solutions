class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int start = 0;
        int end =  arr.length-1;
        String ss = "";
        while(start < end){
            char ch1 = arr[start];
            char ch2 = arr[end];

            boolean first = ch1 == 'a' ||ch1 == 'e' ||ch1 == 'i' ||ch1 == 'o' ||ch1 == 'u' ||ch1 == 'A' ||ch1 == 'E' ||ch1 == 'I' ||ch1 == 'O' ||ch1 == 'U';

            boolean last = ch2 == 'a' ||ch2 == 'e' ||ch2 == 'i' ||ch2 == 'o' ||ch2 == 'u' ||ch2 == 'A' ||ch2 == 'E' ||ch2 == 'I' ||ch2 == 'O' ||ch2 == 'U';

            if(first && last){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(!first){
                start++;
            }
            else end--;
        }

        return new String(arr);
    }
}