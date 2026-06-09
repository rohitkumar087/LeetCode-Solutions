class Solution {
    static void function(int nums[], List<List<Integer>> powerSet, List<Integer> set, int i){
        if(i == nums.length){
            powerSet.add(new ArrayList<>(set));
            return;
        }

        // include 
        set.add(nums[i]);
        function(nums,powerSet,set,i+1);

        // backtracking 
        set.remove(set.size()-1);

        // exclude 
        function(nums,powerSet,set,i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        function(nums,powerSet,set,0);
        return powerSet;
    }
}