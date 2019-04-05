import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celcius degree, such as 38.5: ");
        double celcius = sc.nextDouble();
        double fahrenheit = (9 / 5.0) * celcius + 32;

        System.out.println("The Fahrenheit degree for " + celcius + " Celcius degree is " + fahrenheit);
    }
}