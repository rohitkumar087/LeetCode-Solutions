class Solution {
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'X'){
                    ans++;
                    if(i>0 && board[i-1][j]=='X'){
                        ans--;
                    }
                    else if(j>0 && board[i][j-1] == 'X') {
                        ans--;
                    }
                }
            }
        }

        return ans;



        // int n = board.length;
        // int m = board[0].length;
        // int ans = 0;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(board[i][j] == 'X'){
        //             board[i][j] ='.';
        //             ans++;
        //             while(j+1<m && board[i][j+1] == 'X'){
        //                 board[i][j+1] ='.';
        //                 j++;
        //             }
        //             int temp = i;
        //             while(temp+1<n && board[temp+1][j] == 'X'){
        //                 board[temp+1][j] ='.';
        //                 temp++;
        //             }
        //         }
        //     }
        // }
        // return ans;
    }
}