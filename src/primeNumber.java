import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is prime or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }
    public static void prime(int x){
        int y=0;
        for(int i =2; i<=x/2; i++){
            if(x%i == 0){
                 y = 1;

            }
        }
        if(y==1){
            System.out.println(x +" is not a Prime Number");
        } else {
            System.out.println(x +" is Prime Number");
        }
    }
}
