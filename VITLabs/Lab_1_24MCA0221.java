
import java.util.*;


public class Lab_1_24MCA0221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Program 1: ");
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        printMonthDays(year, month);
        System.out.print("Program 2: ");
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.println("Enter the element " +i+" of the array:");
            array[i] = scanner.nextInt();
        }
        double average = calculateAverage(array);
        System.out.println("The average of the array elements is: " + average);


        
        System.out.print("Program 3: ");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[] maxInRows = findMaxInRows(matrix, rows, cols);
        System.out.println("Maximum elements in each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + maxInRows[i]);
        }
        int[] maxInCols = findMaxInCols(matrix, rows, cols);
        System.out.println("Maximum elements in each column:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + ": " + maxInCols[j]);
        }

    }

    public static int[] findMaxInRows(int[][] matrix, int rows, int cols) {
        int[] maxInRows = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxInRows[i] = max;
        }
        return maxInRows;
    }

    public static int[] findMaxInCols(int[][] matrix, int rows, int cols) {
        int[] maxInCols = new int[cols];
        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxInCols[j] = max;
        }
        return maxInCols;
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;

    }
    public static void printMonthDays(int year, int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            String monthName = getMonthName(month);
            int days = getDaysInMonth(month, year);
            System.out.println(monthName + " has " + days + " days in the year " + year + ".");
        }
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    private static int getDaysInMonth(int month, int year) {
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check for leap year if the month is February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return monthDays[month - 1];
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
