import java.util.Arrays;

public class recursion {

    public static void print_decreasing(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print_decreasing(n-1);
    }
    public static void printInc(int n) {
        if (n==1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumofnatural(int n) {
        if (n==1) {
            return 1;
        }
        return n + sumofnatural(n-1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n ==0) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    //Sum triangle from array
    public static void printSumOfTriangle(int[] arr){
        if (arr.length == 1) {
            Arrays.toString(arr);
            return;
        }
        int[] new_arr = new int[arr.length - 1];

        for(int i=0;i<arr.length - 1;i++){
            new_arr[i] = arr[i] + arr[i+1];
        }

        printSumOfTriangle(new_arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arrr = {1,2,3,4,5};
        printSumOfTriangle(arrr);
    }
}