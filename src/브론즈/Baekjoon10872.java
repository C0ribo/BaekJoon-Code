package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10872 {
    public static void main(String[] args) throws IOException {
        /*
         * 팩토리얼은 재귀함수를 이용해서 풀이한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int sum = 1;
        for(int i=1; i<=num; i++){
            sum *= i; // sum = sum * i
        }
        System.out.println(sum);
    }
}
