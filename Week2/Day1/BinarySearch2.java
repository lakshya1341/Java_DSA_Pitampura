package Week2.Day1;
import java.util.*;

public class BinarySearch2 {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int Binarysearch(int[] arr, int n){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) {
                return mid;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,1,9,5};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println();
        System.out.println(Binarysearch(arr, 9));
        System.out.println(Binarysearch(arr, 7));
    }
}