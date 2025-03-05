class Solution {
    public long coloredCells(int n) {
        long count = 0;

        for(int i = 1; i <= (2*n - 1); i += 2){
            count += i;
        }

        for( int i = 2*n-3; i >= 1; i -= 2){
            count += i;
        }
        return count;
    }
}