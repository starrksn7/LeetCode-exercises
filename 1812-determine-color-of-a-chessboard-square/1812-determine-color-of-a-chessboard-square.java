class Solution {
    public boolean squareIsWhite(String coordinates) {
        String[] array = coordinates.split("");
        String letter = array[0];
        int number = Integer.parseInt(array[1]);
        
        if(letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("g")){
            if(number % 2 == 1){
                return false;
            }
        } else if(letter.equals("b") || letter.equals("d") || letter.equals("f") || letter.equals("h")){
            if(number % 2 == 0){
                return false;
            }
        }
        
        return true;
    }
}