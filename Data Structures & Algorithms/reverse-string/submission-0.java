class Solution {
    public void reverseString(char[] s) {
        char x,y;
        int l = s.length;
        for(int i=0; i<l/2; i++){
            x = s[i];
            s[i] = s[l-i-1];
            s[l-i-1] = x;
        }
        System.out.println(s);
        
    }
}