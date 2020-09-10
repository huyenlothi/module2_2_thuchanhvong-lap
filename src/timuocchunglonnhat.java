import java.util.Scanner;

public class timuocchunglonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter number a: ");
        int a = input.nextInt();
        System.out.println(" enter number b: ");
        int b= input.nextInt();
        a = Math.abs(a);
        b= Math.abs(b);

        if ( a==0 && b==0) {
            System.out.println(" k co UCLN");
        } else {
            if (a == 0 && b != 0) {
                System.out.println(" UCLN la : " + b);
            } else
                if (a != 0 && b == 0) {
                System.out.println(" UCLN la : " + a);
            } else
                if(a!=0 && b!=0) {
                    while (a!=b) {
                        if(a>b)
                            a=a-b;
                        else
                            b=b-a;
                    }
                    System.out.println(" UCLN la: " + a);
                }

        }
    }
}
