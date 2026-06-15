class Solution {
    public boolean isPathCrossing(String path) {
        // int i=0;
        // HashSet <Character> l1 = new HashSet<>();
        // while(i<path.length()){
        //     l1.add(path.charAt(i));
        //     i++;
        // }
        // System.out.println(l1.size());
        // if(l1.size()==4) return true;
        // else if((path.contains("EW")) || (path.contains("NS"))) return true;
        // else return false;

         Set<String> visited = new HashSet<>();
        
        int j = 0; // X coordinate
        int k = 0; // Y coordinate
        
        // 1. Always add the starting point (0,0) first
        visited.add(j + "," + k);
        
        int i = 0;
        // 2. FIXED: Changed '>' to '<' to run through the string
        while (i < path.length()) {
            char direction = path.charAt(i);
            
            if (direction == 'N') j++;
            else if (direction == 'S') j--;
            else if (direction == 'E') k++;
            else if (direction == 'W') k--;
            
            String currentCoordinate = j + "," + k;
            
            // 3. FIXED: Checks if this exact (X,Y) pair was visited before
            if (visited.contains(currentCoordinate)) {
                return true; 
            }
            
            visited.add(currentCoordinate);
            i++;
        }
        
        return false;
    }
}