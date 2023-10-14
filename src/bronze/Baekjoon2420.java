package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon2420 {
    public static void main(String[] args) throws IOException {
        /*
        * 정수 N과 M의 차이를 출력한다.
        * ( | N - M | )
        * 절댓값 구하는 법 Math.abs();
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        Long num1 = Long.parseLong(st.nextToken());
        Long num2 = Long.parseLong(st.nextToken());
        Long result  = num1 - num2;

        System.out.println(Math.abs(result));
    }
}
