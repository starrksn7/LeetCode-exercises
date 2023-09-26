class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int num : nums1){
            list1.add(num);
        }
        
        for(int num : nums2){
            list2.add(num);
        }
        
        List<Integer> sublist1 = new ArrayList<>();
        for(Integer entry : list1){
            if(!list2.contains(entry) && !sublist1.contains(entry)){
                sublist1.add(entry);
            }
        }
        
        result.add(sublist1);
        List<Integer> sublist2 = new ArrayList<>();
        for(Integer entry : list2){
            if(!list1.contains(entry) && !sublist2.contains(entry)){
                sublist2.add(entry);
            }
        }
        result.add(sublist2);
        
        return result;
    }
}