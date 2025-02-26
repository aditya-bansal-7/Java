class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;;
        int minSum = Integer.MIN_VALUE;
        int nSum = 0;
        

        for(int i = 0 ; i < nums.length; i++){
            sum += nums[i];

            nSum += -1*nums[i];
            if(sum < 0){
                sum =0;
            }
            if(nSum < 0){
                nSum = 0;
            }

            minSum = Math.max(nSum,minSum);
            maxSum = Math.max(sum,maxSum);
        }
        return Math.max(minSum,maxSum);
    }
}