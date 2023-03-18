class Solution {
    public int largestAltitude(int[] gain) {
       
        int[] array = new int[gain.length + 1];
        array[0] = 0;
        int arrayCounter = 1;
        
        for(int i = 0; i < gain.length; i++){
            array[arrayCounter] = gain[i] + array[arrayCounter - 1];
            
            arrayCounter++;
            }
        
        
        int highestAltitude = 0;
    
        for(int difference : array){
            if(difference > highestAltitude){
                highestAltitude = difference;
            }
        }
    
        return highestAltitude;
    }
}