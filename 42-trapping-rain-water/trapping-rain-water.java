class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int prefixMax[] = new int[height.length];
        int sufixMax[] = new int[height.length];
        int waterUnits = 0;
        prefixMax[0] = height[0];
        for(int i=1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }

        sufixMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            sufixMax[i] = Math.max(sufixMax[i+1],height[i]); 
        }

        for(int i=0;i<n;i++){
            waterUnits += Math.min(prefixMax[i],sufixMax[i] )- height[i];
        }

        return waterUnits;        
    }
}