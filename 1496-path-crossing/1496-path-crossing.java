class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> pointsVisited = new HashSet<String>();
        pointsVisited.add(x + ", " + y);
        
        for(int i = 0; i < path.length(); i++){
            switch(path.charAt(i)){
                case 'N':
                    y++;
                    break;
                case 'S': 
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            
            String point = x + ", " + y;
            
            if(pointsVisited.contains(point)){
                return true;
            } else {
                pointsVisited.add(point);
            }
        }
        
        return false;
    }
}