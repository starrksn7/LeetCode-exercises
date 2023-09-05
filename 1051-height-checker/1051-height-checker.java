class Solution {
    public int heightChecker(int[] heights) {
        List<Integer> list = new ArrayList<>();
        
        for(int height : heights){
            list.add(height);
        }
        
        Collections.sort(list);
        
        int diffs = 0;
        
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != list.get(i)){
                diffs++;
            }
        }
        
        return diffs;
    }
}