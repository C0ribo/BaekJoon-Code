package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5086 {
    /*
    * 브론즈 3 - 배수와 약수
    *
    * num2 % num1 == 0; factor
    *
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0) break;

            if(num2 % num1 == 0 ){
                sb.append("factor");
            } else if(num1 % num2 == 0){
                sb.append("multiple");
            } else {
                sb.append("neither");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
