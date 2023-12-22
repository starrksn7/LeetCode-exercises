class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            double percentOfArray = entry.getValue() / (double) arr.length;

            if(percentOfArray > .25){
                result = entry.getKey();
            }
        }
        
        return result;
    }
}