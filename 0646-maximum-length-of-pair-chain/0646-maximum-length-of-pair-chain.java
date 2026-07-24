class Solution {
    public int findLongestChain(int[][] pairs) {
        int length = 1;

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int lastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                length++;
                lastEnd = pairs[i][1];
            }
        }

        return length;

    }
}