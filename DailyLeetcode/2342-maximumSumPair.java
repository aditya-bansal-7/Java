class Solution {
    public int maximumSum(int[] nums) {

        Map<Integer,Integer> ma = new HashMap<>();
        int maxSum = 0;

        for(int i = 0 ; i < nums.length; i++){
            int n = sumOfDigit(nums[i]);
            
            if(ma.containsKey(n)){
                int cv = ma.get(n);
                if(maxSum < (cv + nums[i])){
                    maxSum = cv + nums[i];
                }
                ma.put(n, cv > nums[i] ? cv : nums[i]);
            }else{
                ma.put(n,nums[i]);
            }
        }
        return maxSum == 0 ? -1 : maxSum;
    }

    public int sumOfDigit(int n){
        int sum = 0;
        while(n != 0){
            sum += n% 10;
            n /= 10;
        }
        return sum;
    }
}