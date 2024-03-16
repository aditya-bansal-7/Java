public class backtracking {
    
    public static void findAllsub(String s , String ans , int i){
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        
        findAllsub(s, ans+s.charAt(i), i+1);
        findAllsub(s, ans, i+1);
    }

    public static void findAllpurmutaion(String str , String ans){
        if(str.length()==0){
            System.err.println(ans);
            return;
        }
        for(int i=0 ; i < str.length(); i++){
            
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            findAllpurmutaion(newString, ans+curr);
        }
    }
    public static void main(String[] args) {
        String s = "adi";
        findAllpurmutaion(s, "");
    }
}
