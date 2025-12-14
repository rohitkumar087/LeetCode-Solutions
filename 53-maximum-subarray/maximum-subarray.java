class Solution {
    public int maxSubArray(int[] nums) {
       int[] pre = new int[nums.length];
		pre[0] = nums[0];
		for(int i=1;i<nums.length;i++) {
			pre[i]=pre[i-1]+nums[i];
		}
		int min=0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < pre.length; i++) {
		    int curr = pre[i];
		    maxSum = Math.max(maxSum, curr - min);
		    min = Math.min(min, curr);
		}
        return maxSum;
    }
}