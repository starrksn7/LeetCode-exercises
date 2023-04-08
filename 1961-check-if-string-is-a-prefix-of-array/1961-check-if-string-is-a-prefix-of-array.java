class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder string = new StringBuilder();
                
        for(String entry : words){
            string.append(entry);
            
            if(string.toString().equals(s)){
                return true;
            }
            
            if(s.indexOf(string.toString()) == -1){
                return false;
            }
            
        }
        
        return false;
    }
}