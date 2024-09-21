package Week2.Day2;

public class InsertionSort {
    static void display(int[] arr){
        for(int i:arr){
         System.out.print(i+" ");
        }
        }
        static void insertionsort (int[] arr){
                for(int i=1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
               while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
                }
                arr[j+1]=key;
            }

        }
            public static void main(String[] args) {
            int[] arr={4,2,7,9,5};
            insertionsort(arr);
            display(arr);
        }
    
}
