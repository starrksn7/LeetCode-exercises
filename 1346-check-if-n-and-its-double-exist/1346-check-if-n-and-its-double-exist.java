class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            Double first = new Double(arr[i]);
            for(int j = i + 1; j < arr.length; j++){
                Double second = new Double(arr[j]);
                    
                if(first == second / 2.0 || first == second * 2.0){
                    return true;
                }
            }
        }
        return false;
    }
}