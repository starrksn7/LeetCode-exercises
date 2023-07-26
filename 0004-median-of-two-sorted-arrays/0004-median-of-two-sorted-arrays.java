class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        
        for(int i = 0; i < nums1.length; i++){
            array[i] = nums1[i];
        }
        int index = 0;
        for(int j = nums1.length; index < nums2.length; index++){
            array[j] = nums2[index];
            j++;
        }
        
        Arrays.sort(array);
        
        if(array.length % 2 == 1){
            return array[array.length / 2];
        } else {
            return (float)(array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }
    }
}