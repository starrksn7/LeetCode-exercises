class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        Integer total = 0;

             
        for(int i = 0; i < s.length(); i++){

            Integer currentNumeral = values.get(s.charAt(i));
            Integer nextNumeral = 0;

              if(i != s.length() - 1){
              nextNumeral = values.get(s.charAt(i + 1));
            } 
            
            if(currentNumeral < nextNumeral){
                total += nextNumeral - currentNumeral;
                i++;
            } else {
                total += currentNumeral;
            }
        }

        return total.intValue();
        }
        
    }
