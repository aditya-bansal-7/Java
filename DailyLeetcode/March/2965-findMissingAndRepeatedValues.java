class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length + 1;
        int sum = (n*(n-1))/2;
        HashSet<Integer> set = new HashSet<>();
        int a = -1;


        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }else{
                    sum -= grid[i][j];
                    set.add(grid[i][j]);
                }
            }
        }
        int arr[] = {a,sum};

        return arr;
    }
}