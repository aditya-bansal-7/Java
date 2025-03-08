class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 0;

        int left = 0;

        int right = 0;

        while(right < k){
            char ch = blocks.charAt(right);
            if(ch == 'W') min++;
            right++;
        }

        int count = min;

        while(right < blocks.length()){
            char lch = blocks.charAt(left);
            char rch = blocks.charAt(right);
            if(lch == 'W') count--;
            if(rch == 'W') count++;
            min = Math.min(min,count);
            left++;
            right++;
        }
        return min;
    }
}