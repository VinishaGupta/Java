import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum: "+sum);
    }
}
