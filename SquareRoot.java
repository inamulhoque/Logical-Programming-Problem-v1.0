import java.util.*;
public class SquareRoot {
    public static void squaRt(int c){
        double epsilon = 1e-15;
        int t = c;
        while (Math.abs(t - c/t) > epsilon*t) {
            t = ((c/t) + t) / 2;
        }
        System.out.println("Square root of "+c+" is : "+t);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to find square root:");
        int c = obj.nextInt();
        squaRt(c);
    }
}
