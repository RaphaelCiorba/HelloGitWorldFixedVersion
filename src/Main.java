import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nummer1, nummer2, summe;

        try {
            System.out.println("****************Sum of two numbers*****************");
            System.out.println("Enter First Number: ");
            nummer1 = sc.nextInt();

            System.out.println("Enter Second Number");
            nummer2 = sc.nextInt();

            summe = nummer1 + nummer2;
            System.out.println("The sum of these numbers: " +summe);
        }
        catch (Exception e) {
            System.out.println("Error, please type in valid numbers");
        }

    }
}
