import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number to Check whether is it perfect or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x =0;

        for(int i =1; i<=num/2; i++){
           if(num%i == 0){
               x = x+i;
           }

        }
        if(num == x){
            System.out.println(num + "is perfect Number");
        }else{
            System.out.println(num +"is not a perfect Number");
        }
    }
}
