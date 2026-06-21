class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0, rightSum=0, sum=0, l=0, r=cardPoints.length-1;
        while (l<k) {
            leftSum += cardPoints[l];
            l++;
        }
        // if(k==cardPoints.length) return leftSum;
        sum = leftSum + rightSum;
        l=k-1;
        while(l>=0){
            leftSum-=cardPoints[l];
            rightSum+=cardPoints[r];
            sum = Math.max(sum, leftSum+rightSum);
            l--;
            r--;
        }
        return sum;
    }
}