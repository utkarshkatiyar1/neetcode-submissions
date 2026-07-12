class Solution {
    public String largestGoodInteger(String num) {
        for (char digit = '9'; digit >= '0'; digit--) {
            String triplet = String.valueOf(digit).repeat(3);
            if (num.contains(triplet)) {
                return triplet;
            }
        }
        
        return "";
    }
}