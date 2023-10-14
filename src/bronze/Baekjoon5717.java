package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5717 {
    /*
    * 브론즈 4 - 5717 상근이의 친구들
    *
    * 남자친구 M 여자친구 F
    * M + F = 출력
    * 대신 M과 F가 0일일때 출력한다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int male = Integer.parseInt(st.nextToken());
            int female = Integer.parseInt(st.nextToken());

            if(male == 0 && female == 0) break;

            int sum = male + female;
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
