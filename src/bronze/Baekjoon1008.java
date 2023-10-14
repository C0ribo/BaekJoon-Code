package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1008 {

    /*
     * A와 B는 입력 받은 후 A/B 를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " " );
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        double result = ((double)A / B); // 정수 / 정수 -> double 형변환
        sb.append(result);
        sb.append(" ");

        System.out.println(sb);
    }
}
