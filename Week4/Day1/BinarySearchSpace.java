package Week4.Day1;

public class BinarySearchSpace {
        static int reachCenter(int distance,int time){
            int lowSpeed = 0; 
            int highSpeed = 1000;
            int optimalSpeed=-1;
    
            while (lowSpeed <= highSpeed) {
                int midSpeed = highSpeed-(highSpeed-lowSpeed)/2;
                if(check(midSpeed, distance, time)){
                    optimalSpeed=midSpeed;
                    highSpeed=midSpeed-1;
                }
                else{
                    lowSpeed=midSpeed+1;
                }
    
            }
            return optimalSpeed;
        }
        static boolean check(int speed,int distance, int time){
            int dist_travelled=speed*time;
            return(dist_travelled>=distance);
        }
               
    public static void main(String[] args){
        System.out.println("Minimum Speed");
        System.out.println(reachCenter(50, 2));
        
    }
  }
