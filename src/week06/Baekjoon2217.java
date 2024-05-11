package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //로프의 갯수
        int N = Integer.parseInt(br.readLine());
        //로프의 종류
        int[] weight = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }
        //감당 가능한 무게가 큰 순으로 정렬
        Arrays.sort(weight);

        int MAX = 0;
        for (int i = 1; i <= N; i++) {
            MAX = Math.max(MAX, weight[i-1] * i);
        }
        System.out.println(MAX);
    }
}
