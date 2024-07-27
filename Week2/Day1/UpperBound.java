package Week2.Day1;
import java.util.*;

public class UpperBound {
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
        System.out.println();
        System.out.println(BinarysearchUB(arr, 4));
        System.out.println(BinarysearchUB(arr, 6));
    }
}
