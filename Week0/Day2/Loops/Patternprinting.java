package Week0.Day2.Loops;
import java.util.Scanner;

public class Patternprinting {
        public static void main(String[] args) {
            System.out.println("Pattern printing");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            
            
            /*1.
            
            for(int i=0;i<=n;i++){
                for( int j=0;j<i;j++){
                    System.out.print( "* ");
                }
                System.out.println();*/

            /*2.
            
            for(int i=1;i<=n;i++){
                for(int k=1;k<=(n-i);k++){
                    System.out.print( " ");
                    }
                for(int j=1;j<=i;j++){
                    System.out.print( "*");
                    }*/



            /*3.
            
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                }*/
            

            /*4.
            
            for(int i=n;i>=1;i--){
                for(int k=1;k<=(n-i);k++){
                    System.out.print( " ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print( "*");
                    }
                    System.out.println();
                    }sc.close();*/

            /*5.
            
            for(int i=n;i>=1;i--){
                for(int k=1;k<=(n-i);k++){
                    System.out.print("  ");
                    }
                for(int j=1;j<=i;j++){
                    System.out.print( "*");
                    }
                System.out.println();
            }sc.close();*/

            //6.

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                }System.out.println();
            }sc.close();

            


        }
    }
    
    