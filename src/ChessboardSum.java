import java.util.Scanner;

public class ChessboardSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int blackSum = 0;
        int whiteSum = 0;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

                if ((i + j) % 2 == 0) {
                    blackSum += arr[i][j];
                } else {
                    whiteSum += arr[i][j];
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);

        sc.close();
    }
}
