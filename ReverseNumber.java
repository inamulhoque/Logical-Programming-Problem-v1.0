import java.util.Scanner;
public class ReverseNumber {
    public static void reverse(int num){
        int rev = 0;
        while (num!=0){
            int rem = num % 10;
            rev = rev *10 +rem;
            num = num/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = myObj.nextInt();
        reverse(num);
    }
}
