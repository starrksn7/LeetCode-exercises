class Solution {
    public int passThePillow(int n, int time) {
        int currentPillowHolder = 1;
        int passingDirection = 1;
        
        while (time > 0){
           if(currentPillowHolder == n){
               passingDirection *= -1;
               currentPillowHolder--;
           } else if(currentPillowHolder == 1 && passingDirection < 0){
               passingDirection *= -1;
               currentPillowHolder++;
           } else if(passingDirection > 0){
               currentPillowHolder++;
           } else {
               currentPillowHolder--;
           }
            time--;
        }
        return currentPillowHolder;
    }
}