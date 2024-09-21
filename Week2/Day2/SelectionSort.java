package Week2.Day2;

public class SelectionSort {
    static void display(int[] arr){
        for(int i:arr){
         System.out.print(i+" ");
        }
        System.out.println();
        }
        static void selectionsort (int[] arr){
            for(int i=0;i<arr.length-1;i++){
                int idx=minimumValue(arr,i);
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }

        }
        static int minimumValue(int[] arr,int a){
            int mini= a;
            for(int i=a+1; i<arr.length;i++)
            if(arr[mini]>arr[i])
            mini=i;
            return mini;
        }
        public static void main(String[] args) {
            int[] arr={4,2,7,9,5};
            selectionsort(arr);
            display(arr);
        }
}
