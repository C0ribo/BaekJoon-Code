package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2475 {
    /*
    * 5자리를 공백 주고 입력한다.(StringTokenizer)
    * 5번 째까지는 일반 수이지만 6번째 자리 숫자는 검증수이다.
    * 검증수는 입력한 숫자를 각각 제곱해서 % 10 해준 나머지 값이 검증수이다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numPow = 0;

        for(int i = 0; i< 5; i++){
            // koi 회사의 고유번호 5번째 입력
            int koiNumber = Integer.parseInt(st.nextToken());
            // 제곱해주고 더해준다.
            numPow += Math.pow(koiNumber, 2);
        }
        // 나머지 값을 나타내준다
        int result = numPow % 10;

        sb.append(result);
        System.out.println(sb);
    }
}
