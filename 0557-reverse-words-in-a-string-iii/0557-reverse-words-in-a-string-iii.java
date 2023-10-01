class Solution {
    public String reverseWords(String s) {
        String[] string = s.split(" ");
        String[] result = new String[string.length];
        
        for(int i = 0; i < string.length; i++){
            for(int j = string[i].length() - 1; j >= 0; j--){
                if(result[i] == null){
                    result[i] = String.valueOf(string[i].charAt(j));
                } else {
                    result[i] += string[i].charAt(j);
                }
            }
            System.out.println(result[i]);
        }
        
        return String.join(" ", result);
    }
}