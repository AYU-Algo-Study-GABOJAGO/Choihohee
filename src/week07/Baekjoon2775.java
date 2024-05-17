package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2775 {

    static int[][] apart = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_apart();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apart[k][n]).append("\n");
        }
        System.out.println(sb);
    }

    private static void make_apart() {
        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }
    }
}
