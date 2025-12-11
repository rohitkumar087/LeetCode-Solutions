class Solution {
    public int[] findErrorNums(int[] nums) {
       Arrays.sort(nums);

int[] ans = new int[2];
int n = nums.length;

int expectedSum = n * (n + 1) / 2;   

int sum = 0;
int duplicate = -1;

for(int i = 0; i < n; i++){
    sum += nums[i];

    if(i > 0 && nums[i] == nums[i - 1]){
        duplicate = nums[i];
    }
}

int missingNum = expectedSum - (sum - duplicate);

ans[0] = duplicate;
ans[1] = missingNum;

return ans;
    }
}
