
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1 & press Enter to start the stopwatch");
        int a = sc.nextInt();

        if(a ==1 ) {
            startTime = new Date().getTime();
        }else{
            System.out.println("Invalid Input");
        }

        System.out.println("Type 2 & press Enter to stop the stopwatch");
        int b = sc.nextInt();

        if(b == 2) {
            endTime = new Date().getTime();
        }else{
            System.out.println("Invalid Input");
        }

        long timeElapsed = endTime - startTime;

        if(timeElapsed>0 && timeElapsed<10000 ){
            System.out.println("Time : " + timeElapsed/1000 + " Seconds"); // this method gives time in milliseconds so we have to convert it into seconds by dividing it by 1000
        }else{
            System.out.println("Due to invalid input Stopwatch failed");
        }



   }


}
