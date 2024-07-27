package Week1.Day2;
import java.util.*;
public class BinarySearch {
    static boolean Binarysearch(int[] arr, int n){
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n) i=mid+1;
            else j=mid-1;
        }return false;
    }

    static boolean BinarysearchRange(int[] arr, int n, int a, int b){
        int i=a;
        int j=b;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) {
                return true;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,1,5,8,3,6};
        Arrays.sort(arr);
        // System.out.println(Binarysearch(arr, 6));
        // System.out.println(Binarysearch(arr, 15));
        System.out.println(BinarysearchRange(arr, 6, 1, 4));
        System.out.println(BinarysearchRange(arr, 7, 1, 4));
    }
}

