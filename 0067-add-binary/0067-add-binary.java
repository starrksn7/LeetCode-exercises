import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
              
        BigInteger string1Converted = new BigInteger(a,2);
        BigInteger string2Converted = new BigInteger(b,2);
          
        BigInteger returnNumber = new BigInteger("0");
        
        returnNumber = string1Converted.add(string2Converted);
              
        String answer = returnNumber.toString(2);
       
        return answer;
        
    }
}