package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String arr[] = br.readLine().split(" ");

        int L;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            L = Integer.parseInt(arr[i]);
            sum += L;

            if (max < L) {
                max = L;
            }
        }
        System.out.println(sum + (max * (N - 2)));
    }
}
