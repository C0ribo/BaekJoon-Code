package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2558 {
    /*브론즈 5 - 2558
    * A, B 입력 -> A + B 출력
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        sum = A + B;
        sb.append(sum);
        System.out.println(sb);
    }
}
