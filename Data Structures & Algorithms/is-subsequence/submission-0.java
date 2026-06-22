class Solution {
    public boolean isSubsequence(String s, String t) {
        String rep = t;
        boolean ans=true;
        int a;
        for(int i=0; i<s.length(); i++){
            if(rep.indexOf(s.charAt(i)) != -1){
                a=rep.indexOf(s.charAt(i));
                rep= rep.substring(a+1);
            }
            else {ans=false;
            break;
            }
        }
        return ans;
    }
}