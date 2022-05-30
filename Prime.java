import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int flag = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = obj.nextInt();
        for(int i = 2; i<=num/2 ;i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag==1) {
            System.out.println(num+" is not a prime number");
        } else {
            System.out.println(num+" is a prime number");
        }
    }
}
