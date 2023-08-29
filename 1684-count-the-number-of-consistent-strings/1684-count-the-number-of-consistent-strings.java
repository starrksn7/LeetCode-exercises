class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> list = new ArrayList<>();
        int total = words.length;
        
        for(int k = 0; k < allowed.length(); k++){
            list.add(allowed.charAt(k));
        }
        
        for(int i = 0; i < words.length; i++){
            
            for(int j = 0; j < words[i].length(); j++){
                if(!list.contains(words[i].charAt(j))){
                    total--;
                    break;
                }
            }
        }
        return total;
    }
}