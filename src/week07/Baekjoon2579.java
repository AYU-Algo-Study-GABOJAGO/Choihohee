package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon2579 {
    static int stairs[];
    static Integer dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];
        stairs = new int[N+1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stairs[0];
        dp[1] = stairs[1];

        if(N >= 2){
            dp[2] = stairs[1] + stairs[2];
        }
        System.out.println(find(N));
    }

    static int find(int N) {
        if (dp[N] == null)
            dp[N] = Math.max(find(N - 2), find(N - 3) + stairs[N-1]) + stairs[N];
        return dp[N];
    }
}
