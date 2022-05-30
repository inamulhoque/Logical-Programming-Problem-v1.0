import java.util.Scanner;
public class PerfectNumber {
    public static void perfect(int num){
        int sum = 1;
        if (num==0 || num==1){
            System.out.println(false);
        }
        for (int i=2;i<num;i++) {
            int rem = num % i;
            if (rem==0){
                sum = sum + i;
            }
        }
        if (sum==num){
            System.out.println(num+" is a perfect number.");
        } else {
            System.out.println(num+" is not a perfect number");
        }

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = obj.nextInt();
        perfect(num);
    }
}
