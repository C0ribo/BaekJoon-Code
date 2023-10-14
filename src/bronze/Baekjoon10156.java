package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10156 {
    /*
    * 브론즈 4 - 10156 과자
    *
    * 과자 하나 가격 k, 과자 개수 n, 현재 가진 돈 액수 m -> 부모에게 받아야 하는 금액 구하기
    * 예 ) 과자 하나 가격 30원 * 4개 = 120 원, 현재 가진 금액 100원 -> 20원
    * k * n - m = result
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int result = 0;

        st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

         // 부모에게 받아야 하는 양 (k * n) >= m

        if((k * n) > m) { // 부모에게 받아야 하는
            result = (k * n) - m;
            sb.append(result);
        } else {
            sb.append("0");
        }

        System.out.println(sb);

    }
}
