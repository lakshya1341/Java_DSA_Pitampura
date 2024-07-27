package Week1.Day1;
//import java.math.*;
//import java.util.Scanner;

public class Functions {
    static void hey(){
        System.out.println("hey");
    }

        // static void swap(int a,int b){
        // int temp;
        // temp=a;
        // a=b;
        // b=temp;
        // System.out.println("With swapping");
        // System.out.println("1."+a);
        // System.out.println("2."+b);
        // }
        // public static void main(String[] args){
        // hey();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter no. 1");
        // int x=sc.nextInt();
        // System.out.println("Enter no. 2");
        // int y=sc.nextInt();
        // System.out.println("Without swapping");
        // System.out.println("1."+x);
        // System.out.println("2."+y);
        // swap(x,y);
        // sc.close();
        // }


        // static void number(int n){
        //     for(int i=1;i<=n;i++){
        //         System.out.println(i);
        //     }
        // }
        // public static void main(String[] args) {
        //     hey();
        //     System.out.println("Natural Numbers");
        //     number(8);
        // }


        // static boolean prime(int n){
        //     if(n==0 || n==1){
        //     return false;
        // }
        // else if(n==2){
        //     return false;
        // }
        // for(int i=2;i<=n/2;i++){
        //     if(n%i==0){
        //         return false;
        //       }
        //     }
        //     return true;
        // }
        // public static void main(String[] args) {
        //     hey();
        //     System.out.println("Checking the number is prime or not:");
        //     System.out.println(prime(7));
        //     System.out.println(prime(16));
        // }


        // static int inverse(int a){
        //     int n=0;
        //     while(a>0){
        //         n=n*10+a%10;
        //         a=a/10;
        //     }return n;
        // }
        // public static void main(String[] args) {
        //     hey();
        //     System.out.println("Inversed Number");
        //     System.out.println(inverse(1549));
        // }


        // static int count(int a){
        //     int n=0;
        //     int y=0;
        //     while(a>0){
        //         n=n*10+a%10;
        //         a=a/10;
        //         y++;
        //     }
        //     return y;
        // }
        // public static void main(String[] args) {
        //     hey();
        //     System.out.println("Number of digits in the number");
        //     System.out.println(count(456789));
        // }


        // static int count(int a){
        //     int n=0;
        //     int y=0;
        //     while(a>0){
        //         n=n*10+a%10;
        //         a=a/10;
        //         y++;
        //     }
        //     return y;
        // }
        // static boolean CheckArm(int n){
        //     int d=count(n);
        //     int sum=0;
        //     int temp=n;
        //     while(n!=0){
        //         sum+=Math.pow((n%10),d);
        //         n=n/10;
        //     }
        //     return (sum==temp);
        // }
        // public static void main(String[] args) {
        //     hey();
        //     System.out.println(CheckArm(12));
        // }

}
