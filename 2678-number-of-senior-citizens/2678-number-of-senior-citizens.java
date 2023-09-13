class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        
        for(String entry : details){
            if(Integer.valueOf(entry.substring(11, 13)) > 60){
                seniors++;
            }
        }
        
        return seniors;
    }
}