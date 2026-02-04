class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        // int mn = citations[0];
        // int mx = citations[n-1];
        // for(int i=mx;i>0;i--){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(i<=citations[j]){
        //             count++;    
        //         }
        //     }
        //     if(count >= 1){
        //         return count;
        //     }
        // }
        // return 0;

        for(int i=0;i<n;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }
        return 0;
    }
}