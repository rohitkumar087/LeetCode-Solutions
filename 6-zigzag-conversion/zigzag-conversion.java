class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        List<List<Character>> lst = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            lst.add(new ArrayList<>());
        }    

        int index = 0;
        int direction = 1;

        for(char ch : s.toCharArray()){
            lst.get(index).add(ch);
            if(index == 0){
                direction = 1;
            }
            else if(index == numRows-1){
                direction = -1;
            }
            index = index + direction;
        }
        
        StringBuilder sb = new StringBuilder();
        for(List<Character> row : lst){
            for(char ch : row){
                sb.append(ch);
            }
        }

        return sb.toString();

    }
}