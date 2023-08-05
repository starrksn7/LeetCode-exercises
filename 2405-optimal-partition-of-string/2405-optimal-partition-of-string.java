class Solution {
    public int partitionString(String s) {
       int letterAppearances = s.isEmpty() ? 0 : 1;
       HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                letterAppearances++;
            }
            set.add(s.charAt(i));
        }
        return letterAppearances;
    }
}