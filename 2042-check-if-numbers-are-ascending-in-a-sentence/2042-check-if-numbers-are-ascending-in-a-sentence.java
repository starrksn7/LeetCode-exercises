class Solution {
    public boolean areNumbersAscending(String s) {
        
        int lastNumber = 0;
        
        String[] array = s.split(" ");
        
        for(String entry : array){
            try{
                int newNumber = Integer.parseInt(entry);
                if(newNumber <= lastNumber){
                    return false;
                } else {
                    lastNumber = newNumber;
                }
            } catch (Exception e){
                
            }
        }
        
        return true;
    }
}