import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = obj.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        for (int i =0; i<=n;i++){
            int num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

