class Solution {

    public long gcdSum(int[] nums) {
        int n = nums.length;

        int[] mx = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            max = Math.max(max, nums[i]);
            mx[i] = max;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = gcd(nums[i], mx[i]);
        }

        Arrays.sort(arr);

        long ans = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            ans += gcd(arr[left], arr[right]);
            ++left;
            --right;
        }

        return ans;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}