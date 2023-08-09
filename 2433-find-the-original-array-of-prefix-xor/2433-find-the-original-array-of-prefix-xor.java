class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 1){
            return pref;
        }
        
        int[] result = new int[pref.length];
        
        int i = 0;
        int j = 1;
        
        while(i < pref.length - 1){
            result[j] = pref[i] ^ pref[j];
            i++;
            j++;
        }
        result[0] = pref[0];
        
        return result;
        
    }
}