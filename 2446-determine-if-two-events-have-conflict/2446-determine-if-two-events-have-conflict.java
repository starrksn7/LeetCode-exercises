class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int event2StartTime = event2[0].compareTo(event1[1]);
        int event2EndTime = event2[1].compareTo(event1[0]);
        
        return event2StartTime <= 0 && event2EndTime >= 0;
    }
}