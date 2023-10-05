package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958 {
    /*
    * O = 맞은 문제
    * X = 틀린 문제
    * OOXXOXXXOOO = 1 + 2 + 0 + 0 + 1 + 0 + 0 + 1 + 2 + 3 = 10
    * 연속적으로 맞는 거 만큼 연속적으로 늘지만, 틀리는 순간 리셋되고, 다시 맞으면 1씩 쌓임
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스를 입력하면 그만큼 생긴다.
        int[] ox = new int[10]; // 입력해야 하는 10개의 OX 배열 만들기

        for(int i = 0; i < testCase; i++){ // 테스트 케이스만큼 입력할 수 있는걸 for문으로 만든다.
            // o랑 x를 입력하는 걸 만든다.

        }
        System.out.println(sb);
    }
}
