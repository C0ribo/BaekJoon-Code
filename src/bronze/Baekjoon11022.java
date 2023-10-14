package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11022 {
    /*
    * 브론즈 5 - 11022
    * 테스트 케이스 T회 입력
    * A B 입력 \
    *     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i<= T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sum  = A + B;

            sb.append("Case #").append(i).append(":").append(" ");
            sb.append(A).append(" ").append("+").append(" ").append(B).append(" ").append("=").append(" ").append(sum).append("\n");
            // 뭥미.. ?
        }
        System.out.println(sb);
    }
}
