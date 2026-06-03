package Repetitions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }

        maxLen = Math.max(maxLen, currentLen);
        System.out.println(maxLen);
    }
}
