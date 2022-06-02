import java.util.Scanner;
public class Vendingmachine {
    static int note[] = {1000,500,100,50,10,5,2,1};
    static int i = 0;
    static int money;
    static int total=0;

    public static void change(int money){
        if (money == 0){
            System.out.println("Enter greater amount.");
        } else {
            for (i=0;i<note.length;i++) {
                if (money > note[i]) {
                    int changeAmount = money / note[i];
                    int rem = money % note[i];
                    money = rem;
                    total = total + changeAmount;
                    System.out.println(note[i] + " Rupee note = " + changeAmount);
                }
            }
        }
        System.out.println("Total number of notes are: "+total);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int money = myObj.nextInt();
        Vendingmachine.change(money);
    }
}
