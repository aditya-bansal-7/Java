class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 1;
        int start = 0;
        int bitmask = 0;

        for(int end = 0; end < nums.length; end++){
            while((bitmask & nums[end]) != 0){
                bitmask ^= nums[start];
                start++;
            }
            bitmask |= nums[end];

            max = Math.max(end - start + 1 , max);
        }
        return max;
    }
}