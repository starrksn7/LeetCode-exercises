class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder string = new StringBuilder();
        
        for(int i = 0; i < array.length; i++){
            if(!array[i].isEmpty()){
                string.insert(0, array[i]);
                if(i < array.length - 1){
                    string.insert(0, " ");
                }
            }
        }
        return string.toString();
    }
}