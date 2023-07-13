class Solution {
    public int numberOfBeams(String[] bank) {
        int beams = 0;
        int currentRow = 0;
        int previousRow = 0;
        
        for(int i = 0; i < bank.length; i++){
            currentRow = countOnes(bank[i]);
            beams += currentRow * previousRow;
            if(currentRow != 0){
                previousRow = currentRow;
            }
        }
        return beams; 
    }
    
    public int countOnes(String row){
        
        int lasers = 0; 
        
        for(int i = 0; i < row.length(); i++){
            if(row.charAt(i) == '1'){
                lasers++;
            }
        }
        
        return lasers;
    }
}