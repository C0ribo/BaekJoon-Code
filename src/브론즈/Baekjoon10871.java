package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    /*
    * 입력) N x 를 입력한다.
    * N 은 몇개 정수를 출력하는 지 입력, X는 N개 수들 중에서 x보다 작은거 출력
    *
    * */
    public static void main(String[] args) throws IOException {
        // BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer를 사용해서 " " 구분자로 BufferedReader를 쪼갠다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // Random을 이용해서 푸는 문제인줄 알앗는데 그건 또 아니었다.
        // 반복문을 실행할 N 과 비교할 X 선언
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // 결과를 담을 StringBuilder 선언
        StringBuilder sb = new StringBuilder();
        // 반복문에서 다시 입력받을 것이므로 StringTokenizer 초기화
        st = new StringTokenizer(br.readLine(), " ");

        // 반복문으로 수열 A 입력
        for(int i= 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            // 수열 A에서 X보다 작은 수를 StringBuilder에 넣는다.
            if (value < X) {
                sb.append(value);
                sb.append(" ");
            }
        }
        // 출력
        System.out.println(sb);
    }
}