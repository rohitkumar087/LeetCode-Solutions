class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        for(int i=1; ;i++){
            n-=i;
            if(n<0){
                break;
            }
            row++;
        }
        return row;
    }
}