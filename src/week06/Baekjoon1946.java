package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] work;

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            int count = 1;
            work = new int[M + 1];

            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                work[A] = B;
            }


            int vot = work[1];

            for (int j = 2; j <= M; j++) {
                if (work[j] < vot) {
                    vot = work[j];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
