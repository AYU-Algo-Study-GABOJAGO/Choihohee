package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon4796 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        //0 초기화
        int i = 0;
        int L = 0;
        int P = 0;
        int V = 0;
        int cnt = 0;

        while(true) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0)
                break;
            else {
                cnt++;
                int camp = V / P * L;
                int mod = V % P;
                if(mod > L) camp += L;
                else if(mod <= L) camp += mod;
                System.out.println("Case " + cnt + ": " + camp);
            }
        }
    }
}