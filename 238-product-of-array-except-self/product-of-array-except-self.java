class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Brute Force 
        // int[] arr = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             product = product*nums[j];
        //         } 
        //     }
        //     arr[i]=product;
        // }  
        // return arr;    

		int n = nums.length;
		int[] prefix = new int[n];
		int[] sufix = new int[n];
		
		prefix[0] = 1;
		sufix[n-1] = 1;
		
		for(int i=1;i<n;i++) {
			prefix[i] = prefix[i-1]*nums[i-1];
		}
		
		for(int i=n-2;i>=0;i--) {
			sufix[i] = sufix[i+1]*nums[i+1];
		}
		
		int[] ans = new int[n];
		for(int i=0;i<n;i++) {
			ans[i] = prefix[i]*sufix[i];
		}
		return ans; 
    }
}