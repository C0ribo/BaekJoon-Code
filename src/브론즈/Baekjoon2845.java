package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2845 {
    /*
    * 첫번쨰 줄 1m^2 에 사람 수 L , 파티 넓이 P
    * 두번째 줄 다섯 신문에 적힌 인원 (공백)
    *
    * ( L * P ) - 입력값
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int people = l * p;
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<5; i++){
            int news = Integer.parseInt(st.nextToken());
            result  = news - people;
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }
}
