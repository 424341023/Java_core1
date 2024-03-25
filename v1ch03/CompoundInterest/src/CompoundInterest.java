/**
 * @author rongguang
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2023/12/5 10:08
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRates = new double[NRATES];
        for (int j = 0; j < interestRates.length; j++)
            interestRates[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRates[j];

                // compute this year's balance
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRates.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRates[j], "");

        System.out.println();

        // print balance table
        for (double[] row : balances) {
            // print tablw row
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
