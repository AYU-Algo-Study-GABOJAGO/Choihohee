package week02.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            switch (str[0]){

                case "push_front":
                    deque.addFirst(Integer.valueOf(str[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.valueOf(str[1]));
                    break;
                case "pop_front":
                        sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append("\n");
                    break;
                case "pop_back":
                        sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
