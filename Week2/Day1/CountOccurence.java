package Week2.Day1;
import java.util.*;

public class CountOccurence {
    static int BinarysearchLB(int[] arr, int n){
        int i=0;
        int j=arr.length-1;
        int firstOcc=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) {
                firstOcc=mid;
                j=mid-1;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return firstOcc;
    }
    static int BinarysearchUB(int[] arr, int n){
        int i=0;
        int j=arr.length-1;
        int UpperB=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) {
                UpperB=mid+1;
                i=mid+1;
            }
            else if(arr[mid]<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return UpperB;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,6,6,4,4,8,1,9,5};
        Arrays.sort(arr);
        //Sorted Array={1,2,4,4,4,5,6,6,6,8,9} 
        int a=BinarysearchLB(arr, 6);
        int b=BinarysearchUB(arr, 6);

        // Extra part of code not of use
        // if(a==b){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println(b-a);
        // }
        
        System.out.println(b-a);
       
    }
}

