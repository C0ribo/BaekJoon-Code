package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // N개 입력
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        // N회 반복
        for(int i = 1; i <= N; i++){
            // 두번째 줄 숫자 입력받음
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            //int[] arrNum = new int[number];

            // 배열을 훑는다.
            sum += number;
            sb.append(sum);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
