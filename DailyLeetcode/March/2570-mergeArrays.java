class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> nums3 = new ArrayList<int[]>();
        int m = nums1.length; int n = nums2.length;
        int i = 0; int j = 0;
        while(i < m && j < n) {
            if(nums1[i][0] > nums2[j][0]) {
                nums3.add(nums2[j++]);
            }
            else if (nums1[i][0] < nums2[j][0]) {
                nums3.add(nums1[i++]);
            }
            else {
                nums1[i][1] += nums2[j][1];
                nums3.add(nums1[i]);
                i++; j++;
            }
        }
        while(i < m) nums3.add(nums1[i++]);
        while(j < n) nums3.add(nums2[j++]);
        return nums3.toArray(new int[nums3.size()][2]);
    }
}