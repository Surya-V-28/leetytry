
public class RotateMatrix {

    public static void main(String args[]) {
        System.out.println("working the code");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(" Before T Matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }

        // transpose the matrix 
        // martirx -2 is beacuase of the last element in the last row is the diagonal element
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After T Matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix.length) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }

        }
        System.out.println("After T Matrix and Final:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
