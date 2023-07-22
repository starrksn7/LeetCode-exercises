class Solution {
    public int findTheWinner(int n, int k) {
        int out = 0;
        List<Integer> friends = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            friends.add(i);
        }
        
        while(friends.size() > 1){
            out = (out + k - 1) % friends.size();
            friends.remove(out);
        }
        
        return friends.get(0);
    }
}