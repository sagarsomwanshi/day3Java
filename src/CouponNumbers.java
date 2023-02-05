import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {



        System.out.println("Enter How many distinct Coupons you want");
        Scanner sc = new Scanner(System.in);
        int couponCount = sc.nextInt();
        int[] coupons = new int[couponCount];


        int check = 0;
        int totalcount = 0;

            for (int i = 0; i < coupons.length; i++) {

                int a = randomNo();
                if(a < 0){
                    a = a * (-1);
                }

                    for (int j = 0; j < coupons.length; j++) {

                        if(a == coupons[j]) {
                            check = 1;
                        }
                    }
                    if(check != 1) {
                        coupons[i] = a;
                    }
                    totalcount++;



            }
        System.out.println("Please find the coupon Numbers below");
        System.out.println(Arrays.toString(coupons));
        System.out.println("Total coupons generated to get " +couponCount + " distinct coupons are " +totalcount);

    }
    public static int randomNo(){
        Random ran = new Random();
        int a = ran.nextInt();
        return a;
    }


}

