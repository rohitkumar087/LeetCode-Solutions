class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        int target = n;
        int curr = n-1;

        while(curr>=0){
            if(curr+nums[curr] >= target){
                target = curr;
                curr--;
            }
            else{
                curr--;
            }
        }
        
        if(target == 0){
            return true;
        }
        return false;
    }
}