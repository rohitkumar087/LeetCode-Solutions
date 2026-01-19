class Solution {
    public int dominantIndex(int[] nums) {
       int index = 0;
       int largest = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            largest = nums[i];
            index = i;
        }
       }
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]*2 > largest){
            return -1;
        }
       }
       return index;
    }
}