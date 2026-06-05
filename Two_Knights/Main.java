package Two_Knights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (long i = 1; i <= n; i++) {
            long totalWays = (i * i) * ((i * i) - 1) / 2;
            long attackingWays = 4 * (i - 1) * (i - 2);
            long nonAttackingWays = totalWays - attackingWays;
            System.out.println(nonAttackingWays);
        }
        sc.close();
    }
}
