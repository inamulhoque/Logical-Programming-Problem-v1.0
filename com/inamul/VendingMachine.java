package com.inamul;
import java.util.Arrays;
import java.util.Scanner;
public class VendingMachine {
    static int [] note = {1,2,5,10,50,100,500,1000};
    static int i = 0;
    static int money;
    static int total=0;

    public static void change(){
        if (money == 0){
            System.out.println("Enter greater amount.");
        } else {
            if (money>note[i]){
                int changeAmount=money/note[i];
                int rem = money%note[i];
                money = rem;
                total = total+changeAmount;
                System.out.println(note[i]+" Rupee note = "+changeAmount);
            }
            i++;
            System.out.println(money);
            System.out.println(Arrays.toString(note));
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int money = myObj.nextInt();
        VendingMachine.change();
        System.out.println("Total number of notes are: "+total);
    }
}
