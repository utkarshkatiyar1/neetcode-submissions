class Solution {
    public int lengthOfLastWord(String s) {
        String t1 = s.trim();
        int length = 0;
        for (int i = t1.length() - 1; i >= 0; i--) {
            if (t1.charAt(i) == ' ') {
                break;
            }
            length++;
        }       
        return length;
    }
}