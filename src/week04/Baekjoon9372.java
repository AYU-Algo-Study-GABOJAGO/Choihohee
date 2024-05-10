package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (T-->0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());


        }
    }
    static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);


    }
}
//입력 먼저.
//방향이 없는 그래프 -> 왕복비행기 (방향이 중요!!!!) 최소신장트리, visit[] 갔는지 안 갔는지