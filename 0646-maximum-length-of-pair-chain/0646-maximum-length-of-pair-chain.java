class Solution {
    public int findLongestChain(int[][] pairs) {
        int chain = 0;
        int index = 0;
        int length = pairs.length;
        
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        
        while(index < length){
            chain++;
            int currentEnd = pairs[index][1];
            while(index < pairs.length && pairs[index][0] <= currentEnd){
                index++;
            }
        }
        
        return chain;
    }
}

 