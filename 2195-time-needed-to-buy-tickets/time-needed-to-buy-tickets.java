class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int second = 0;
        Queue<Integer>  qu = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            qu.add(i);
        }

        while(true){
            int person = qu.poll();
            --tickets[person];
            second++;

            if(tickets[person]==0){
                if(person == k){
                    return second;
                }
            }
            else{
                qu.add(person);
            }



        }
    }
}