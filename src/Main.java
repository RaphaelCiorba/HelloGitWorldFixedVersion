import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nummer1, nummer2, mult1, mult2, summe, multsum;

        try {
            System.out.println("****************Sum of two numbers*****************");
            System.out.println("Enter First Number: ");
            nummer1 = sc.nextInt();

            System.out.println("Enter Second Number");
            nummer2 = sc.nextInt();

            summe = nummer1 + nummer2;
            System.out.println("The sum of these numbers: " +summe);

            System.out.println("****************Multiplication of two numbers*****************");
            System.out.println("Enter First Number: ");
            mult1 = sc.nextInt();

            System.out.println("Enter Second Number");
            mult2 = sc.nextInt();

            multsum = mult1 * mult2;
            System.out.println("The product of these numbers: " +multsum);
        }
        catch (Exception e) {
            System.out.println("Error, please type in valid numbers");
        }

    }
}
