class Solution {
    public int dayOfYear(String date) {
        Map<Integer, Integer> priorMonthTotals = new HashMap<>();
        priorMonthTotals.put(1, 0);
        priorMonthTotals.put(2, 31);
        if(Integer.parseInt(date.substring(0,4)) % 4 != 0 || Integer.parseInt(date.substring(0,4)) == 1900){
            priorMonthTotals.put(3, 59);
            priorMonthTotals.put(4, 90);
            priorMonthTotals.put(5, 120);
            priorMonthTotals.put(6, 151);
            priorMonthTotals.put(7, 181);
            priorMonthTotals.put(8, 212);
            priorMonthTotals.put(9, 243);
            priorMonthTotals.put(10, 273);
            priorMonthTotals.put(11, 304);
            priorMonthTotals.put(12, 334);
        } else {
            priorMonthTotals.put(3, 60);
            priorMonthTotals.put(4, 91);
            priorMonthTotals.put(5, 121);
            priorMonthTotals.put(6, 152);
            priorMonthTotals.put(7, 182);
            priorMonthTotals.put(8, 213);
            priorMonthTotals.put(9, 244);
            priorMonthTotals.put(10, 274);
            priorMonthTotals.put(11, 305);
            priorMonthTotals.put(12, 335);
        }
        
            
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
       
        return priorMonthTotals.get(month) + day;
    }
}  