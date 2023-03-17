class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right){
            int H = Math.min(height[left], height[right]);
            int W = right - left;
            maxArea = Math.max(maxArea, H*W);
            
            if(left < right && height[left] <= H){
                left++;
            } else{ 
                right--;
            }
        }
        return maxArea;
    }
}

   