class Solution {
    public int mySqrt(int x) {
       
        int start = 1;
        int end = x;
        
        if(x == 0){
            return 0;
        }
        
        while(start < end){
            
            int middle = start + (end - start) / 2;
            
            if(middle <= x / middle && (middle + 1) > x / (middle + 1)){
              return middle;  
            } else if(middle > x / middle){
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        
        return start;
        }
    }
