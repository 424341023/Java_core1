package unsynch;

import java.util.Arrays;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月30日 16:29:53
 * @packageName threads
 * @className Bank
 */
public class Bank {
    private final double[] accounts;

    public Bank(int n, double inicialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, inicialBalance);
    }

    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}
