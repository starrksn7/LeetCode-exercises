class Solution {
    public boolean isPalindrome(String s) {
        String testString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        for(int i = 0; i < testString.length() - 1; i++){
            if(!(testString.charAt(i) == testString.charAt(testString.length() - (1 + i)))){
                return false;
            }
        }
        
        return true;
    }
}