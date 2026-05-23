class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length-1;

        int water = 0;

        while(i<=j){
            int min = Math.min(height[i],height[j]);
            water = Math.max(min*(j-i),water);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }   
        return water;     
    }
}