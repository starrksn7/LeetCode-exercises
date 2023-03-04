class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String[] jewelsArray = jewels.split("");
        
        System.out.println(Arrays.toString(jewelsArray));
        
        int counter = 0;
        
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){                                    
                if(jewelsArray[i].equals(Character.toString(stones.charAt(j)))){
                    counter++;
                }
            }
        }
        return counter;
    }
}