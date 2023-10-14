package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11021 {
    /* 브론즈 5 - 11021
        몇번 테스트를 할것인가 T 를 입력 -> 그리고 T만큼 A, B를 입력 (공백)
        각각 A와 B를 더해준다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        int sum = 0;
        int x = 1;

        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sum = A + B;
            sb.append("Case #").append(i).append(":").append(" ").append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
