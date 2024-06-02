package week09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon1654 {
    /*
    메모리: 17320 KB
    시간: 188 ms
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];

        long max = 0;   //입력한 랜선중 가장 길이가 긴 랜선

        // 입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        // 중요!! 반드시 max에서 +1 값이어야 한다.
        // 0 값만 존재한다 했을 때, min = 0, max = 0 이면 min < max 조건이 아니기에 이분탐색을 수행하지 않게 된다.
        //그렇게 되면 Upper Bound 값은 0이 되어버린다. 그것을 방지하기 위함이다.
        //자연수 탐색 범위를 0 ~ max 가 아닌 0 ~ max + 1 범위에서 탐색
        max++;

        long min = 0;   //입력한 랜선중 가장 길이가 짧은 랜선
        long middle = 0;

        while (min < max) {
            // 범위 내에서 중간 길이를 구한다.
            middle = (max + min) / 2;

            long count = 0; //총 몇 개가 만들어지는지
            // 구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지를 구한다.
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / middle);
            }
            /*
             *  [upper bound 형식]
             *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
             *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
             *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
             */
            if(count < N) {
                max = middle;
            }
            else {
                min = middle + 1;
            }
        }
        // UpperBound로 얻어진 값(min)에 -1이 최대 길이가 된다.
        System.out.println(min - 1);
    }
}
