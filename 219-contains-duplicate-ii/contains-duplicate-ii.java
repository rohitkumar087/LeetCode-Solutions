class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // Brute force approach
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=nums.length-1;j>i;j--){
    //         if(nums[i]==nums[j] && Math.abs(i - j) <= k){
    //             return true;
    //         }
    //     }
    //    } 
    //    return false;

        // HashMap approach
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                int ind = hs.get(nums[i]);
                if(i-ind<=k) return true;
            }
            hs.put(nums[i],i);
        }
        return false;
    }
}