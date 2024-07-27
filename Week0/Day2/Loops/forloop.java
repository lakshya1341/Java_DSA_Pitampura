package Week0.Day2.Loops;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        System.out.println("For_loop");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        sc.close();
    }
   
    
}
