/**
 * @author rongguang
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2023/12/5 10:32
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int MAX = 10;

        // allocate triangular array
        int[][] odds = new int[MAX + 1][];
        for (int n = 0; n <= MAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
            /*
            compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
             */
                int lottyOdds = 1;
                for (int i = 1; i <= k; i++)
                    lottyOdds = lottyOdds * (n - i + 1) / i;
                odds[n][k] = lottyOdds;
            }

        // print triangular array
        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
