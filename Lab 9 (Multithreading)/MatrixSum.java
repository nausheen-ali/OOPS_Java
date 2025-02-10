import java.util.Random;

class RowSumCalculator implements Runnable {
    private int[] row;
    private int rowIndex;
    private int[] rowSums;

    public RowSumCalculator(int[] row, int rowIndex, int[] rowSums) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.rowSums = rowSums;
    }

    public void run() {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        rowSums[rowIndex] = sum;
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        int[] rowSums = new int[rows];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random integers between 0 and 9
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            threads[i] = new Thread(new RowSumCalculator(matrix[i], i, rowSums));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int totalSum = 0;
        for (int sum : rowSums) {
            totalSum += sum;
        }

        System.out.println("Row sums:");
        for (int sum : rowSums) {
            System.out.println(sum);
        }
        System.out.println("Total sum: " + totalSum);
    }
}
