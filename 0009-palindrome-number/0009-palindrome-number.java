class Solution {
    public boolean isPalindrome(int x) {
        Integer newX = new Integer(x);

        String stringX = newX.toString();

        for(int i = 0; i < stringX.length(); i++){
            if(stringX.charAt(i) != stringX.charAt(stringX.length() - (i +1))){
                return false;
            }
        }
        return true;
    }
}