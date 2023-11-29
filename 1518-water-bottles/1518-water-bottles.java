class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        
        while (numBottles >= numExchange){
          totalDrank += numBottles / numExchange;
          numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        
        return totalDrank;
    }
}