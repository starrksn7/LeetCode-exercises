class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                list.add(entry.getKey());
            }            
        }
               
        if(list.size() > 1){
            Collections.sort(list);
            return list.get(list.size() - 1);
        } else if (list.size() == 1) {
            return list.get(0);
        }
        
        return -1;
    }
}
