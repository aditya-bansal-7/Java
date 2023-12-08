public class diamond {

    public static void diamond_pattern(int num) {
        //first

        for (int i = 1; i <= num ; i++) {
    
            for (int j = 1 ; j <= (num - i) ; j++) {
                // System.out.print(num - i);
                System.out.print(" ");

            }
            for (int k = 1 ; k <= (2*i)-1; k++) {
                System.out.print("*");
            }

            System.out.println();
            // System.out.println((2*i)-1);
        }

        for (int i = num; i >= 1 ; i--) {
    
            for (int j = 1 ; j <= (num - i) ; j++) {
                // System.out.print(num - i);
                System.out.print(" ");

            }
            for (int k = 1 ; k <= (2*i)-1; k++) {
                System.out.print("*");
            }

            System.out.println();
            // System.out.println((2*i)-1);
        }
    }

    public static void halfinvertedpyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void halfinvertedpyramidnumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void floydstriangle(int n){
        int s = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s + " ");
                s = s +1;
            }
            System.out.println();
        }
    }
    
    public static void triangle01(int n){
        int s = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s+" ");
                if(s == 1){
                    s = 0;
                }
                else{
                    s = 1;
                }
            }
            System.out.println();
        }
    }
    
    public static void butterflypattern(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int index = 1; index <=i ; index++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n -1 ; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int index = 1; index <=i ; index++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void hollowrombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n; j++) {
                if(i==1||j==1||j==n||i==n){
                    System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
    
    public static void solidrombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n; j++) {
               System.out.print("*");
            }
        
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //diamond_pattern(10);
        //halfinvertedpyramid(10);
        //halfinvertedpyramidnumbers(10);
        //floydstriangle(5);
        //triangle01(5);
        //butterflypattern(5);
        //solidrombus(10);
        //hollowrombus(4);
    }
    
}
/*
 * 
 * 
 *    *
 *   ***
 *  *****
 * *******
 * 
 * 
 * 
 * 
 * 
 * 
 */