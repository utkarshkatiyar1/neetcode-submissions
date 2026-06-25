class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int a = 0;
        
        while (a < first.length() && a < last.length()) {
            if (first.charAt(a) == last.charAt(a)) {
                a++;
            } else {
                break;
            }
        }
        return first.substring(0, a);
    }
}