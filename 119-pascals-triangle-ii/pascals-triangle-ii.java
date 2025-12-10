class Solution {
public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(rowIndex == 0){
            return ans.get(0);
        }
        prev.add(1);
        prev.add(1);
        ans.add(prev);
        if(rowIndex == 1){
            return ans.get(1);
        }
        for(int i=2;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            int size = prev.size();
            for(int j=1;j<size;j++){
                curr.add(prev.get(j) + prev.get(j-1));
            }
            curr.add(1);
            // ans.add(curr);
            prev=curr;
        }

        return prev;
 }
}
