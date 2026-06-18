class Solution {
    public int countSeniors(String[] details) {
        // 12 - 14
        int i= 0;
        int ans=0;
        while(i<details.length){
            String str = details[i];
            int l = Integer.parseInt(str.substring(11, 13));
            System.out.println(l);
            if(l>60) ans++;
            i++;
        } 

        return ans;
        
    }
}