class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m+n];

        int i=0 ,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++] = nums1[i];
                i++;
            }
            else{
                merge[k++] =nums2[j];
                j++;
            }
        }

        while(i<m){
            merge[k++]=nums1[i];
            i++;
        }
        while(j<n){
            merge[k++]=nums2[j];
            j++;
        }

       for(int b=0;b<nums1.length;b++){
            nums1[b]=merge[b];
       }
    }
}