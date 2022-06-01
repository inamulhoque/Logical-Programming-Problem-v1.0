import java.util.*;
public class Temperature {
    public static void FahrenheitToCelsius(float degree1){
        float temp = (degree1 - 32) * 5/9;
        System.out.println("The temperature in Celsius is :"+temp+"°C");
    }
    public static void CelsiusToFahrenheit(float degree2){
        float temp = (degree2 * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is :"+temp+"°F");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Degree fahrenheit to celsius: 1");
        System.out.println("Degree celsius to fahrenheit: 2");
        System.out.println("Choose your option: ");
        float option = obj.nextFloat();
        switch ((int) option){
            case 1:
                System.out.println("Enter degree in fahrenheit:");
                float degree1 = obj.nextFloat();
                FahrenheitToCelsius(degree1);
                break;
            case 2:
                System.out.println("Enter degree in celsius:");
                float degree2 = obj.nextFloat();
                CelsiusToFahrenheit(degree2);
                break;
        }
    }
}
