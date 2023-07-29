class Solution {
    public int wateringPlants(int[] plants, int capacity) {
      int totalSteps = 0;
      int water = capacity;
        
        for(int i = 0; i < plants.length; i++){
            if(plants[i] > water){
               totalSteps += (2 * i);
                water = capacity;
            }
            water -= plants[i];
            totalSteps++;
            
        }
        return totalSteps;
    }
}
