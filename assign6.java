 import java.util.Scanner;

public class assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0-Phy, 1-Chem, 2-Math
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                if (marks[i][j] < 0) {
                    i--;
                    break;
                }
            }
        }

        // Calculate
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        // Display
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2]);
            System.out.println("Percentage: " + percent[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
