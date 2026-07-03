class Solution {
    int[] dp;
    public int deleteAndEarn(int[] nums) {
        int n=10001;
        int[] val=new int[n];
        for(int num:nums){
            val[num]+=num;
        }
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,val);
        
    }
    public int solve(int i,int[] val){
        int n=10001;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=val[i]+solve(i+2,val);
        int skip=solve(i+1,val);

        return dp[i]=Math.max(take,skip);
    }
    
}