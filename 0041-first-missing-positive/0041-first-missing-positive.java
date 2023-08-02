class Solution {
    public int firstMissingPositive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num > 0){
                set.add(num);
            }
        }
        
        int numToCheck = 1;
        
        while(true){
            if(!set.contains(numToCheck)){
                return numToCheck;
            }
            numToCheck++;
        }
    }
}


