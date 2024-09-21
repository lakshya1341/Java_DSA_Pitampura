package Week6.Day1;

public class TwoDArray {

     // Input for 2-D array
     static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }

    // Display Function to display array bcz array print index
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // Sum of the element 2-D Array
    static int sum2DArray(int[][] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }

    // Searching in 2-D Array
    static int[] Linearsearch(int[][]nums, int n){
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if (n==nums[i][j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
       return ans;
    }

    
    public static void main(String[] args) {

        // Understanding Arrays
        // int [] arr=new int[4];
        // int[][] nums= new int[3][4];
        // System.out.println(arr);
        // System.out.println(nums);
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[0][1]);

        // Basic 2-D Array
        // int[]arrnew={1,2,3,4};
        // int[][]newnums={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // System.out.println(arrnew[2]);
        // System.out.println(newnums[2][1]);

        // 3-D Array        // L  B  H
        // int[][][] grid=new int[3][4][5]; //Imagine Square 
        // System.out.println(grid);

        // // 5-D Array
        // int[][][][][]Grid=new int[4][2][1][2][3];
        // System.out.println(Grid);

        // Input for 2-D array
        int[][] nums= new int[3][3];
        populate(nums);
        display(nums);

        //Sum
        int sum=sum2DArray(nums);
        System.out.println("Sum "+sum);

        // LinearSearch
        int[]LS=Linearsearch(nums, 8);
        for(int i=0;i<LS.length;i++){
            System.out.println(LS[i]+" ");
        }
    }
}      

   