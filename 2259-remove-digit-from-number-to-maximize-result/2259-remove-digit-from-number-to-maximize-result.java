class Solution {
    public String removeDigit(String number, char digit) {
     List<String> nums = new ArrayList<>();
        
      for(int i = 0; i < number.length(); i++){
          if(number.charAt(i) == digit){
              String placeholder = number.substring(0, i) + number.substring(i + 1);
              nums.add(placeholder);
          }
      }
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }
}