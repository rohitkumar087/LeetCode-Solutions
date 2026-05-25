class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        int[] sufix = new int[n];
        sufix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufix[i] = sufix[i+1]+nums[i];
        }

        for(int i=0;i<n;i++){
            if(prefix[i] == sufix[i]){
                return i;
            }
        }

        if(n == 1){
            return 0;
        }
        
        return -1;
    }
}