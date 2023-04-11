class Solution {
    public String removeStars(String s) {
        Stack<Character> result = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
               result.pop();
            } else {
                result.push(s.charAt(i));
            }
        }
        
        StringBuilder stringResult = new StringBuilder();
        
        while(!result.isEmpty()){
            stringResult.append(result.pop());
        }
        return stringResult.reverse().toString();
    }
}