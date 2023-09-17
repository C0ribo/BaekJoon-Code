package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2588 {
    /*
    * 브론즈 3 - 곱셈
    *
    * (3) -> (1) * (2)의 일의 자리
    * (4) -> (1) * (2)의 십의 자리
    * (5) -> (1) * (2)의 백의 자리
    * (6) -> (1) * (2)
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int num3 = num1 * (num2 % 10); // 일의 자리
        int num4 = num1 * ((num2 % 100)/10); // 십의 자리
        int num5 = num1 * ((num2 % 1000)/100); // 백의 자리
        int num6 = num1 * num2;

        sb.append(num3).append("\n").append(num4).append("\n").append(num5).append("\n").append(num6).append("\n");
        System.out.println(sb);
    }
}
