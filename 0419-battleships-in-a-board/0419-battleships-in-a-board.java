class Solution {
    public int countBattleships(char[][] board) {
        if(board.length == 0){
            return board.length;
        }
        
        int ships = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')){
                    ships++;
                }
            }
        }
        
        return ships;
    }
}