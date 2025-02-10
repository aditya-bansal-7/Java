class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();

        int count = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            char ch = s.charAt(i);
            if(ch < 'a'){
                str.delete(count-1,i);
                count--;
            }else{
                str.append(ch);
                count++;
            }
        }
        return str.toString();
    }
}