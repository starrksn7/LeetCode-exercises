class Solution {
    public int minPartitions(String n) {
     
        String[] array = n.split("");
        
        int largestDigit = 0;
        
        for(int i = 0; i < array.length; i++){
            int element = Integer.parseInt(array[i]);
            if(element > largestDigit){
                largestDigit = element;
            }
        }
        
        return largestDigit;
    }
}