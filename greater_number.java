import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        System.out.print("Enter a number x= ");
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("\nEnter a number y= ");
        Scanner scc = new Scanner(System.in);
        scc.close();
        sc.close();
        int y = scc.nextInt();
        if(x<y){
            System.out.println("greater number is " + y);
        }
        else{
            System.out.println("greater number is " + x);
        }
    }
}
