package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        * 현재 문제점 : 3 눌렀을 때 세번 입력할 순 있는데 나눠져 나옴!! 한줄 아님
        * 내가 잘못 알고 있었던 것 : 범위가 1부터 100까지이므로 int형이나 long형으로 담을 수 없다.
        * 그러므로 각각 문자열로 받아서 charAt(0) 부터 charAt(N) 까지의 합을 구하면 되는 것이었다.
        * */

        // N개 입력
        int N = Integer.parseInt(br.readLine()); // 5를 입력받는다.
        int sum = 0; // 합계 0으로 초기화
        String s = br.readLine(); // 문자열로 받는다.

        for(int i = 0; i < N; i++) // 5회 반복한다.
            sum += s.charAt(i)-'0'; // sum = sum + number를 해서 총 합을 계산한다.
        sb.append(sum);
        sb.append(" ");
        System.out.println(sb);
    }
}
