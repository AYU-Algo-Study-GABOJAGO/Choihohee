package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mushrooms[] = new int[10];

        for (int i = 0; i < 10; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += mushrooms[i];

            if (sum > 100) {
                if (100 - (sum - mushrooms[i]) < sum - 100) {
                    System.out.println(sum - mushrooms[i]);
                    break;
                } else if (100 - (sum - mushrooms[i]) >= sum - 100) {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
