package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[][] arr = new int[K + 1][2];
        arr[0][0] = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1][0] = arr[i][1];
            arr[i + 1][1] = arr[i][0] + arr[i][1];
        }
        System.out.println(arr[K][0] + " " + arr[K][1]);
    }
}
