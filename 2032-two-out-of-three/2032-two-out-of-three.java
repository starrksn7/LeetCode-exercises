class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        Set<Integer> list3 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums1){
            list1.add(num);
            set.add(num);
        }
        
        for(int num : nums2){
            list2.add(num);
            set.add(num);
        }
        
        for(int num : nums3){
            list3.add(num);
            set.add(num);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int num : set){
            if(list1.contains(num) && list2.contains(num) || list1.contains(num) && list3.contains(num) || list2.contains(num) && list3.contains(num)){
                result.add(num);
            }
        }
        
        return result;
        
    }
}