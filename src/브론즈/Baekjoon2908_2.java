package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String strNum = st.nextToken();
        String strNum2 = st.nextToken();
        StringBuilder sb = new StringBuilder(strNum);
        StringBuilder sb2 = new StringBuilder(strNum2);
        // stringbuilder 로 reverse 사용
        String reverseNum1 = sb.reverse().toString();
        String reverseNum2 = sb2.reverse().toString();

        int num1 = Integer.parseInt(reverseNum1);
        int num2 = Integer.parseInt(reverseNum2);

        int max = Math.max(num1, num2);
        System.out.println(max);
    }
}
