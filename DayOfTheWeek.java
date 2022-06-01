import java.util.*;
public class DayOfTheWeek {
    public static void days(int m, int d, int y){
        y = (short) (y - (14 - m) / 12);
        short x = (short) (y + y/4 - y/100 + y/400);
        m = (short) (m + 12 * ((14 - m) / 12) - 2);
        d = (short) ((d + x + 31*m/ 12) % 7);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        short m = sc.nextShort();
        System.out.println("Enter day: ");
        short d = sc.nextShort();
        System.out.println("Enter year: ");
        short y = sc.nextShort();
        System.out.println("Mon=1,Tue=2, Wed=3, Thu=4, Fri=5, Sat=6, Sun=7");
        DayOfTheWeek.days(m,d,y);
    }
}
