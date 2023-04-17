class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNumCandies = 0;
        List<Boolean> result = new ArrayList<>();
        
        for(int k = 0; k < candies.length; k++){
            if(candies[k] > greatestNumCandies){
                greatestNumCandies = candies[k];
            }
        }
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatestNumCandies){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}