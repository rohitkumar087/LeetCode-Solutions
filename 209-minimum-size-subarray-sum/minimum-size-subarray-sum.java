class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Brute Force
        // int n = nums.length;
        // int minLen = Integer.MAX_VALUE;

        // for(int i=0;i<n;i++){
        //     int currSum = 0;
        //     for(int j=i;j<n;j++){
        //         currSum += nums[j];
        //         if(currSum >= target){
        //             minLen = Math.min(minLen,j-i+1);
        //         }
        //     }
        // }
        // if(minLen==Integer.MAX_VALUE) return 0;
        // return minLen;

        // Sliding Window Approach
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int currSum = 0;
        while(j < n){
            currSum += nums[j];
            while(currSum >= target){
                minLen = Math.min(minLen,j-i+1);
                currSum = currSum-nums[i];
                i++;
            }
            j++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}