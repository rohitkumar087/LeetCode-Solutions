class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

        List<int[]> ans = new ArrayList<>();
        int curr = intervals[0][1];
        ans.add(intervals[0]);
        int s = 0;
        
        for(int i=1;i<intervals.length;i++){
            int nextStart =intervals[i][0];
            int nextEnd = intervals[i][1];
            if(curr>=nextStart){
                curr=Math.max(curr,nextEnd);
                ans.get(s)[1] =curr;
            }
            else{
                ans.add(intervals[i]);
                s++;
                curr = nextEnd;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}