package Number_Spiral;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long n = Math.max(y, x);
            long ans;

            if (n % 2 == 0) {
                if (y == n) {
                    ans = n * n - x + 1;
                } else {
                    ans = (n - 1) * (n - 1) + y;
                }
            } else {
                if (x == n) {
                    ans = n * n - y + 1;
                } else {
                    ans = (n - 1) * (n - 1) + x;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
