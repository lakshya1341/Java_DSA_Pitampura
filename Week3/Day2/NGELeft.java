package Week3.Day2;

public class NGELeft {
       static int[] NGEL(int[] arr){
        int maxElement=0;
        int[] ngel= new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            ngel[i]=maxElement;
            maxElement= Math.max(arr[i],maxElement);
        }
        return ngel;
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] ngeLeft=NGEL(arr);
        for(int i:ngeLeft){
            System.out.print(i+" ");
        }
    }
    
}