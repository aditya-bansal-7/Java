class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int max=0;
        for(int i=0;i<cardPoints.length&&i<k;i++)max+=cardPoints[i];
        int last=max;
        for(int i=cardPoints.length-1;i>=0&&k>0;i--){
            k--;
            last=last+cardPoints[i]-cardPoints[k];
            max=Math.max(max,last);
        }
        return max;

    }
}