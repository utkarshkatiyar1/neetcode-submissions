class Solution {
    public int numUniqueEmails(String[] emails) {
        List <String> l1 = new ArrayList<>();
        int count =0;
        for(int i=0; i<emails.length; i++){
            int j=emails[i].indexOf("@");
            String loc = emails[i].substring(0, j);
            String dom = emails[i].substring(j, emails[i].length());
            if(loc.contains("+")){
                loc=loc.substring(0, loc.indexOf("+"));
            }
            loc=loc.replaceAll("\\.", "");
            String fin = loc+dom;
            if(!l1.contains(fin)) 
            {
                count++;
                l1.add(fin);
            }
        }  

        return count;      
    }
}