package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon18353 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] str = input.split(" ");
        int[] soldiers = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            soldiers[i] = Integer.parseInt(str[i]);
        }
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            if (soldiers[i] < soldiers[i + 1]){
                count++;
            }
        }
        //int[] copyOfsoldiers = Arrays.copyOf(soldiers, soldiers.length - count);
        System.out.println(count);

    }
}
