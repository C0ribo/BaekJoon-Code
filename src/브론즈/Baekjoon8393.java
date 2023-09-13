package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8393 {
    /* 브론즈 5 - 8393
    *  입력값 N을 주어졌을 때 -> 출력 1~N 의 합을 출력
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum += i;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
