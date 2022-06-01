import java.util.*;
public class MonthlyPayment {
    public static void monthlyPayment(float P, float Y, float R){
        float n = 12*Y;
        float r = R/(12*100);
        float payment = (float) ((P*r)/(1-(Math.pow((1+r),(-n)))));
        System.out.println("Monthly payment would be: "+payment);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Principal loan amount: ");
        float P = obj.nextFloat();
        System.out.println("Enter total term in Years: ");
        float Y = obj.nextFloat();
        System.out.println("Enter R percent compounded monthly: ");
        float R = obj.nextFloat();
        monthlyPayment(P,Y,R);
    }
}
