class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (mapST[charS] != 0 && mapST[charS] != charT) {
                return false;
            }
            if (mapTS[charT] != 0 && mapTS[charT] != charS) {
                return false;
            }
            
            mapST[charS] = charT;
            mapTS[charT] = charS;
        }
        
        return true;
    }
}