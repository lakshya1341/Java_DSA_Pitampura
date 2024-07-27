package Week0.Day2.Loops;
import java.util.Scanner;

public class nestedforloop {
    public static void main(String[] args) {
        System.out.println("Nested_For_Loop");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                System.out.print( "* ");
            }
            System.out.println();

        }sc.close();

        }
    }
    
