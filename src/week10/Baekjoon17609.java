package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            if(palindrome(str))
                System.out.println(0);
            else if(pseudoPalindrome(str))
                System.out.println(1);
            else
                System.out.println(2);
        }
    }

    private static boolean palindrome(String str) {//회문
        int start = 0;
        int end = str.length()-1;
        while(start <= end) {
            if(str.charAt(start++)!=str.charAt(end--)) return false;
        }
        return true;
    }

    private static boolean pseudoPalindrome(String str) {//유사회문
        int start = 0;
        int end = str.length()-1;

        while(start <= end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return palindrome(str.substring(start,end)) || palindrome(str.substring(start+1, end+1));
            }
            start++;
            end--;
        }
        return true;
    }
}
