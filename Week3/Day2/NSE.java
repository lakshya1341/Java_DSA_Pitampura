package Week3.Day2;

public class NSE {
    static int[] nser(int[] arr){
        int[] NSER= new int[arr.length];
        int minElement=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(minElement==Integer.MAX_VALUE)
            NSER[i]=0;
            else
                NSER[i]=minElement;
                minElement=Math.min(minElement, arr[i]);
            }
            return NSER;

        }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] ngeRight=nser(arr);
        for(int i:ngeRight){
            System.out.print(i+" ");
        }
    }
}

    

