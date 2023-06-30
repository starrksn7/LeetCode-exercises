class Solution {
    public int maxCoins(int[] piles) {
        int results = 0;
        int pilesChosen = 0;
        int rightIndex = piles.length - 2;
        Arrays.sort(piles);
        
        while(pilesChosen < piles.length){
            results += piles[rightIndex];
            rightIndex -= 2;
            pilesChosen += 3;
        }
        
        return results;
    }
}