package Week6.Day1;
import java.util.*;

public class Sorting {

    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void sortByRows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }

    static void sortByColumns(int[][] nums){
        // Arrays.sort(nums);
        // Using Comparable function
        Arrays.sort(nums,(a,b)->Integer.compare(a[0], b[0]));
    }

    static void completesort(int[][] nums){
        int[] arr= flaten(nums);
        Arrays.sort(arr);
        fillArray(nums,arr);
    }

    static int[] flaten(int[][] nums){
        int rows=nums.length;
        int cols=nums[0].length;
        int[] arr=new int[rows*cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i+j]=nums[i][j];
            }
        }
        return arr;
    }

    static void fillArray(int[][] nums, int[] arr){
        int rows=nums.length;
        int cols=nums[0].length;
        for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            nums[i][j]=arr[cols*i+j];
        }
    }
}
   
    public static void main(String[] args) {
        int[][] nums={{1,4,3},{8,6,7},{2,5,9}};
        display(nums);
        // System.out.println("Sorted Row-Wise");
        // sortByRows(nums);
        // display(nums);
        // System.out.println("Sorted Column-Wise");
        // sortByColumns(nums);
        // display(nums);
        System.out.println();
        completesort(nums);
        display(nums);

    }
    
}
