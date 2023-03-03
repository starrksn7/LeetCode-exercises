class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        
        for(int i = 0; i < operations.length; i++){
            if(operations[i].contains("-")){
                counter--;
            } else {
                counter++;
            }
        }
        return counter;
    }
}