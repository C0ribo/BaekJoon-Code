package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10810 {
    /*
    * 브론즈 3 - 공 넣기
    *
    * N 바구니 개수 M 테스트 케이스
    * i번 바구니부터 j번 바꾸니까지 k번
    * 1 2 3 (1번 바구니부터 2번 바구니까지 3번 공을 넣는다.) 1[3] 2[3] 3[0] 4[0] 5[0]
    * 3 4 4 (3번 바구니부터 4번 바구니까지 4번 공을 넣는다.) 1[3] 2[3] 3[4] 4[4] 5[0]
    * 1 4 1 (1번 바구니부터 4번 바구니까지 1번 공을 넣는다.) 1[1] 2[1] 3[1] 4[1] 5[0]
    * 2 2 2 (2번 바구니부터 2번 바구니까지 2번 공을 넣는다.) 1[1] 2[2] 3[1] 4[1] 5[0]
    *
    * 배열 내 값이 존재할 때, 다른 값을 넣으면 덮어씌워지기 때문이다.
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arrN = new int[n];
        int m = Integer.parseInt(st.nextToken());

        for(int x = 0; x<m; x++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int y = i-1; y <j; y++){// 1번부터 2번 바구니까지 3번공 넣으면 y = 0 y = 1 / 1번 바구니 ~4번 바구니 1번공 y = 0 y = 1 y = 2 y= 3
                arrN[y] = k; // arrN[0] = 3 , arrN[1] = 3 / arrN[0] = 1 arr
            }
        }
        for(int basket : arrN)
            sb.append(basket).append(" ");
        System.out.println(sb);
    }
}
