import java.util.*;

public class strings {

    public static void print_letter(String str) {
        for(int i = 0 ; i < str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        
    }

    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i -1)) {
                return false;
            }
        }
        return true;
    }

    public static float shortest_path(String str){
        int x = 0 , y = 0;
        for(int i =0 ; i<str.length();i++){
            char dic = str.charAt(i);
            if (dic == 'N') {
                y++;
            }else if(dic== 'S'){
                y--;
            }else if(dic == 'E'){
                x++;
            }else{
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }
    
    public static int lower_vowel_check(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e'||ch == 'o' || ch == 'i' || ch == 'u'){
                count++;
            }
            
        }
        return count;
    }
     
    public static void check_anagram(String str1,String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean result = Arrays.equals(arr1, arr2);

            if(result){
                System.out.println("Given Stings are anagrams");
            }else{
                System.out.println("Not Anagram");
            }
        }else{
            System.out.println("not equal length");
        }
        
        


        
    }
    
    public static void repeat_counter(String str) {
        str = str.toLowerCase();
        char[] strs = str.toCharArray();
        
        Arrays.sort(strs);
        
        int count = 0;

        char lastChar = strs[0];

        for (char c : strs) {
            if (lastChar == c) {
                count++;
            }else{
                System.out.println(lastChar + " count = " + count);
                lastChar = c;
                count = 1;
            }
        }
        System.out.println(lastChar + " count = " + count);
    }
    
    
    public static void main(String[] args) {
        String adi = "Aditya";
        String bnsl = "Bansal";
        // Scanner sc = new Scanner(System.in);
        String name = "racecar";

        String name2 = "Carrace";

        
        
        repeat_counter(bnsl);

        System.out.println(name.charAt(2));
        print_letter(name);
        System.out.println(palindrome(name));
        System.out.println(lower_vowel_check(name));
        System.out.println(lower_vowel_check(adi));
        System.out.println(lower_vowel_check(name2));

    }
    
}
