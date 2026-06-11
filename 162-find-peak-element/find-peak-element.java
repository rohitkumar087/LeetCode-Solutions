class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length == 1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-2]<arr[arr.length-1]) return arr.length-1;

        int start = 1;
        int end = arr.length-2;

        while(start <= end){
            int mid = (start+end)/2;
            
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){ 
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}