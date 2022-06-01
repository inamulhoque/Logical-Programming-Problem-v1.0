import java.util.Scanner;
public class CouponNumber {
    public static void coupon(int num){
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            int randNum = (int) (Math.floor(Math.random()*10)%num);
            arr[i] = randNum;
            System.out.println(randNum);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=(int) (Math.floor(Math.random()*10)%num);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int num = obj.nextInt();
        coupon(num);
    }
}
