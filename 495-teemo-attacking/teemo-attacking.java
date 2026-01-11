class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int start = timeSeries[0];
        int end = start+duration-1;
        int total = 0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i] > end){
                total += (end - start)+1;
                start = timeSeries[i];
                end = start + duration -1;
            }
            else{
                end = timeSeries[i]+ duration -1;
            }
        }
        total +=(end-start+1);
        return total;

    }
}