class Solution {
    public int maximum69Number (int num) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        
        int indexToChange = list.lastIndexOf(6);
        
        if(list.contains(6)){
            list.set(indexToChange, 9);
        }
           
        int returnNum = 0;
        
        for(int i = list.size() - 1; i >= 0; i--){
            returnNum += Math.pow(10, i) * list.get(i);
        }
        
        return returnNum;
    }
}