package Week6.Day1;

public class Transpose {
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

    static void transpose(int[][] nums){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        // Input for 2-D array
        int[][] nums= new int[3][3];
        populate(nums);
        display(nums);
        
        transpose(nums);
        System.out.println("transpose");
        display(nums);
    }

    
}
