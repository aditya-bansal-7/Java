import java.util.Arrays;
import java.util.List;


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
        int bitMask1 = (~0) << max+1;
        int bitMask2 = (2^(min - 1)) -1;
        int bitMask = bitMask1 | bitMask2;
        return k & bitMask;

    }


    public static int set_ith_bit(int k,int i) {
        int bitMask = 1 << i;
        return k | bitMask;
    }

    public static int clear_ith_bit(int k , int i){
        int bitMask = ~(1 << i);
        return k & bitMask;
    }

    public static boolean check_2th_power(int k) {
        return ((k & (k-1)) == 0);
    }

    public static int set_bit_count(int k){
        // time complexity = 0(logn)
        int count = 0;
        while (k>0) {
            if ((k & 1) == 1) {
                count++;
            }
            k = k >> 1;
        }
        return count;
    }

    public static int fast_exponent(int base , int power){
        int ans = 1;
        while (power > 0) {
            if ((power & 1 ) != 0) {
                ans = ans * base;
            }
            base = base*base;
            power = power >> 1;
        }
        return ans;
    }
    
    public static void value(int k){
        System.out.println(k);
    }

    public static void swapping_using_xor(int x , int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        value(x);
        value(y);


    }
    

    public static int getFirstSetBit(int n){
        int first = 1;
        if (n==0){
            return 0 ;
        }
        while((n & 1) == 0){
            first++;
            n = n>>1;
        }
        return first;   
    }

    public static int binaryGap(int n) {
        String s="";
        int t=n;
        while(t>0)
        {
            int r=t%2;
            s=s+r+"";
            t=t/2;
        }
        
        int mx=0;
        int start=s.indexOf('1');
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='1')
            {
                    mx=Math.max(mx,i-start);
                    start=i;
            }
        }
        return mx;
    }
    public static int[] evenOddBit(int n) {
        int even_count = 0;
        int odd_count = 0;
        int index = 0;
        while(n!=0){
            if ((n&1) == 1){
                if(index % 2 == 0){
                    even_count++;
                }else{
                    odd_count++;
                }
            }
            index++;
            n = n >> 1;
        }
        int res[] = new int[2];
        res[0] = even_count;
        res[1] = odd_count;
        return res;
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0 ; i<nums.size() ; i++){
            if ( k == set_bit_count(i)){
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }
    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int res[] = new int[arr.length];
        int index = 0;
        int set_count = 0;
        while(index<arr.length){
            for(int i = 0; i < arr.length ; i++){
                if(set_bit_count(arr[i])==set_count){
                    res[index] = arr[i];
                    index++;
                    arr[i] = 0;
                }
            }
            set_count++;
        }
        return res;
    }

    public int minBitFlips(int start, int goal) {
        int bitmask = start ^ goal;
        int count = 0;
        while(bitmask != 0){
            if((bitmask%2)==1){
                count++;
            }
            bitmask >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(binaryGap(5049));
    }
}