public class TwoDArrays {

    public static void main(String[] args) {
        // Load arrays A, B, and C with internally generated numbers
        int[][] A = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
        int[][] B = { {10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120} };
        int[][] C = { {500} };
        
        // Print arrangement A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
        }
        System.out.println();
        
        // Print arrangement B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.print(C[0][0]);
            System.out.println();
        }
    }
}
