class Solution {
    public static boolean check(int arr[],int k,int h){
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += (arr[i]+k-1)/k;
        }
        if(sum<=h) return true;
        return false; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans = 0;
        for(int n:piles) {
            end = Math.max(n,end);
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(check(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}