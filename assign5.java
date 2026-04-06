import java.util.Scanner;

public class assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics: ");
            phy[i] = sc.nextInt();
            if (phy[i] < 0) { i--; continue; }

            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();
            if (chem[i] < 0) { i--; continue; }

            System.out.print("Maths: ");
            math[i] = sc.nextInt();
            if (math[i] < 0) { i--; continue; }

            // Percentage
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            // Grade
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        // Display
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + phy[i]);
            System.out.println("Chemistry: " + chem[i]);
            System.out.println("Maths: " + math[i]);
            System.out.println("Percentage: " + percent[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
