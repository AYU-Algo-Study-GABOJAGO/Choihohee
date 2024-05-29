package week08;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2003 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //투포인터 핵심로직
        int sum = 0;
        int start = 0, end = 0, count=0;

        while(true) {   //무한루프
            if(sum>=m) {
                sum = sum - arr[start++];
            }else if(end==n) {  // end가 맨 끝에 도착했을 경우
                break;  // 반복문을 끝낸다
            } else {    // 합이 m보다 작으면
                sum = sum + arr[end++]; //  값을 더해주고 end++한다
            }
            if(sum==m) {
                count++;    // sum과 m이 일치하는 경우 count를 증가시킨다
            }
        }
        System.out.println(count);
    }
}