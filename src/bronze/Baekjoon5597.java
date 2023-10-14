package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5597 {
    /*
    * (1) 30까지의 배열 생성
    * (2) 제출 안한 사람 출력
    * (3) 무조건 앞이 작은 수로
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] hw = new boolean[31]; // 30개 배열 만들기 -> 출석체크이므로
        // [31] => 0 ~ 30 포함까지

        for(int i = 0; i < 28; i++ ){ // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
            int index = Integer.parseInt(br.readLine()); // 28개의 index를 받는다.
            hw[index] = true; // 출석 체크니까 true -> 28명이 제출
        }
        for(int i = 1; i <= 30; i++){ // 1번 부터 30번까지
            if(!hw[i]){ // 만약 배열안에 들어가지 않는다면
                sb.append(i); // stringbuilder에 포함시킨다.
                sb.append("\n");
            }
        }
        System.out.println(sb); // Stringbuilder 안에 넣은것을 출력한다.
    }
}
