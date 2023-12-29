class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> nums = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int order = 1;
        int[] result = new int[arr.length];
        
        for(int num : arr){
            nums.add(num);
        }        
        
        for(int num : nums){
            map.put(num, order++);
        }
        
        for(int i = 0; i < arr.length; i++){
            result[i] = map.get(arr[i]);
        }
        
        return result;
    }
}