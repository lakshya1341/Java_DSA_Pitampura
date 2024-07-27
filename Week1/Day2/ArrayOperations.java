package Week1.Day2;

public class ArrayOperations {

    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    static void swapArr(int[] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseUsingSwaping(int[] arr){
        for(int i=0, j=arr.length-1; i<j; j--, i++)
        swapArr(arr, i, j);
    }

    static void reverseUsingSwap(int[] arr, int a, int b){
        for(int i=a, j=b; i<j; j--, i++)
        swapArr(arr, i, j);
    }


    static int sumrange(int[] arr, int a, int b)
    {
        int sum=0;
        if(a>b||a<0||b<0||b>arr.length){
            return 0;
        }
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        return sum;
    }


    static int sum(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }


    static void reverse(int[] arr){
        int[] temp=new int [arr.length];
        for(int i=0;i<arr.length;i++)
        temp[i]=arr[arr.length-1 - i];
        //This dont work bcz it swallow copies the array
        //arr=temp;

        //Deep Copy
        for(int i=0;i<arr.length;i++)
        arr[i]=temp[i];
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // System.out.println("Sum of the array is:"+sum(arr));

        // System.out.println("Sum in range is:"+sumrange(arr,1,2));
        // // System.out.println("Sum in range is:"+sumrange(arr,3,4));
        // // System.out.println("Sum in range is:"+sumrange(arr,4,1));

        // System.out.println("Reversing the elements:");
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");}

        // System.out.println();
        // System.out.println("Reverse of the Array is:");
        // reverse(arr);
        // printArr(arr);

        // System.out.println("The Array:");
        // printArr(arr);
        // System.out.println();
        // System.out.println("Swapping values inside a Array:");
        // swapArr(arr, 1, 3);
        // printArr(arr);

        System.out.println();
        System.out.println("Reversing using swap");
        reverseUsingSwap(arr, 1, 3);
        printArr(arr);
    }
    
}
