import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Enter temperature in degrees Celsius: ");
        Scanner input=new Scanner(System.in);
        float cel=input.nextInt();
        float fahrenheit=(cel-32)*5/9;
        System.out.println(fahrenheit);
    }
}
