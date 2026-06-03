package Increasing_Array;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long moves = 0;
        long prev = Long.parseLong(st.nextToken());

        for (int i = 1; i < n; i++) {
            long cur = Long.parseLong(st.nextToken());

            if (cur < prev) {
                moves += (prev - cur);
            } else {
                prev = cur;
            }
        }

        System.out.println(moves);
    }
}