import java.util.Scanner;

public class assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        // Display numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal = " + total);

        sc.close();
    }
}
