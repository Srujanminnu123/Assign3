import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int[] table = new int[10];

        // Store values
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
