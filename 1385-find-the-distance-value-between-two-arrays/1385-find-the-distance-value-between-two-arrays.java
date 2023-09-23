class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int total = 0;
        
        for(int i = 0; i < arr1.length; i++){
            int subtotal = 0;
            
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) > d){
                    subtotal++;
                }    
            }
            
            if(subtotal == arr2.length){
                total++;
            }
        }
        
        return total;
    }
}