package Week1.Day1;

public class Arrays {
    static void hey(){
        System.out.println("Hey");
    }
    static void print(int []arr){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
        System.out.println();

        //for each loop
        for(int i:arr)
        System.out.print(i+" ");

    }
    public static void main(String[] args) {
        int[] arr1= new int[10];
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        boolean[] arr2=new boolean[6];
        char[] arr3=new char[6];
        double[] arr4=new double[6];

        System.out.println(arr1);
        System.out.println(nums);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);

        System.err.println(arr1[0]);
        arr1[0]=4;
        System.err.println(arr1[0]);

        int[] newarr=new int[6];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=i+1;
        }
        System.out.println("New Array Printed");
        print(newarr);
    }
}
