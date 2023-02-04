import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        System.out.println("Please enter a number to get reverse of it");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        reverse(a);

    }
    public static void reverse(int x){
        int reverse = 0;

        while(x!=0){
            int b = x%10;
            reverse = reverse * 10 + b;
            x = x/10;
        }
        System.out.println(reverse);


    }
}
