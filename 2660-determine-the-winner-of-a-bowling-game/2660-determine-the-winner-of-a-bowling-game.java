class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0;
        int score2 = 0;
        
        for(int i = 0; i < player1.length; i++){
            if((i >= 1 && player1[i - 1] == 10) || (i >= 2 && player1[i - 2] == 10)){
                score1 += player1[i] *2;
            } else {
                score1 += player1[i];
            }
            
            if((i >= 1 && player2[i - 1] == 10) || (i >= 2 && player2[i - 2] == 10)){
                score2 += player2[i] *2;
            } else {
                score2 += player2[i];
            }
            
        }
        
        
        return score1 > score2 ? 1 : score1 == score2 ? 0 : 2; 
    }
}