import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
       System.out.println("Enter a number up to which you want to get  fibonacci series ");
       Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3=0;
                System.out.println(n1 + "\n" + n2 );

        while(n3 <= num){
            n3 = n1 + n2;
            System.out.println(n3);
            n1= n2;
            n2 = n3;
        }

    }
}
