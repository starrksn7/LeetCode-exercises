class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int total = 0;
        
        int indexToCheck = 0;
        
        if(ruleKey.equals("color")){
            indexToCheck = 1;
        } else if(ruleKey.equals("name")){
            indexToCheck = 2;
        }
        
        for(List<String> entry : items){
            if(entry.get(indexToCheck).equals(ruleValue)){
                total++;
            }
        }
        
        return total;
    }
}