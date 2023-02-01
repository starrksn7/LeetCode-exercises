class Solution {
    public int[] plusOne(int[] digits) {
        
            for(int i = digits.length-1; i >= 0; i--){
                if(digits[i] < 9){
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
                
        int[] newArray = new int[digits.length + 1];
        
        newArray[0] = 1;
        
        for(int i = 1; i < newArray.length; i++){
            newArray[i] = 0;
        }
    
        return newArray;
              
//         String[] stringArray = new String[digits.length];
        
//         for(int i = 0; i < digits.length; i++){
//             stringArray[i] = Integer.valueOf(digits[i]).toString();
//         }
//         String joinedArray = String.join("", stringArray);
        
//         BigInteger joinedArrayAsLong = new BigInteger(joinedArray);
//         BigInteger incrementByOne = new BigInteger("1");
//         joinedArrayAsLong.add(incrementByOne);
        
//         String returningNumber = String.valueOf(joinedArrayAsLong);
        
//         String[] returningArray = returningNumber.split("");
        
        
//         int[] returningIntArray = new int[returningArray.length];
        
//         for(int i = 0; i < returningArray.length; i++){
//             returningIntArray[i] = Integer.parseInt(returningArray[i]);
//         }
        
//         return returningIntArray;
    }
}