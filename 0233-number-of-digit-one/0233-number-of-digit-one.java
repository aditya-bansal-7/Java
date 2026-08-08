class Solution {

    Integer dp[][][];
    public int countDigitOne(int n) {
        dp = new Integer[10][2][10];
        String s = "" + n;
        return solve(s,0,1,0);
    }

    public int solve(String s, int idx, int flag, int cnt){
        if(idx == s.length()) return cnt;

        if(dp[idx][flag][cnt] != null) return dp[idx][flag][cnt];

        int limit = flag == 1 ? s.charAt(idx) - '0' : 9;

        int ans = 0;

        for(int i = 0; i <= limit; i++){
            int upcnt = (i == 1) ? 1 : 0;
            if(flag == 0){
                ans += solve(s, idx+1,flag,cnt + upcnt);
            }else{
                ans += solve(s, idx+1, i == s.charAt(idx) - '0' ? 1 : 0,cnt + upcnt);
            }
        }

        return dp[idx][flag][cnt] = ans;
    }
}