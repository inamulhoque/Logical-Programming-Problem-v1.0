import java.util.Scanner;
public class StopWatch {
    public static long startTime;
    public static long endTime;
    public static void getStartTime(){
        startTime=System.currentTimeMillis();
        System.out.println("Start time is: "+startTime);
    }
    public static void getEndTime(){
        endTime=System.currentTimeMillis();
        System.out.println("End time is: "+endTime);
    }
    public static long elapseTime(){
        long result = endTime-startTime;
        return result;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Press 1 to start.");
        int startingTime = obj.nextInt();
        getStartTime();
        System.out.println("Press Zero to stop.");
        int stopTime = obj.nextInt();
        getEndTime();
        if (stopTime==0){
            long result = elapseTime();
            System.out.println("Elapsed time is: "+result+" Milliseconds");
        }
    }
}
