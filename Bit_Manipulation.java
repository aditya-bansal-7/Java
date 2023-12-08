/**
 * Bit_Manipulation
 */
public class Bit_Manipulation {
    

    public static void odd_even(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1){
            System.out.println("ODD");

        }else{
            System.out.println("Even");
        }
    }

    public static int ith_bit_finder(int k , int i) {
        int bitMask = 1 << i;
        if((k & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int clear_last_ith_bit(int k , int i){
        // while (i >= 0){
        //     k = clear_ith_bit(k, i);
        //     i--;
        // }
        int bitMask = (~0) << i;

        return k & bitMask;
    }

    public static int clear_range_bits(int k , int min , int max){
        int bitMask = (~0) << ;

    }


    public static int set_ith_bit(int k,int i) {
        int bitMask = 1 << i;
        return k | bitMask;
    }

    public static int clear_ith_bit(int k , int i){
        int bitMask = ~(1 << i);
        return k & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_last_ith_bit(15, 2));
    }
}