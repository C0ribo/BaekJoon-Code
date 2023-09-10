package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10950_2 {
    public static void main(String[] args) throws IOException {
        /*
        * StringBuilder 사용
        * */
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int input = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i = 1; i <= input; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int result = num1 + num2;

            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
