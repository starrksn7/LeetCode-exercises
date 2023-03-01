class Solution {
    public String defangIPaddr(String address) {
        String[] array = address.split("\\.");
        
        String defangedAddress = String.join("[.]", array);
        
        System.out.println(array[0]);
        
        return defangedAddress;
    }
}