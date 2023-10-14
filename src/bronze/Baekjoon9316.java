package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9316 {
    /*
    * 브론즈 4 - Hello Judge
    *
    * n 반복개수
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i =1; i<=n; i++){
            sb.append("Hello World, Judge").append(" ").append(i).append("!").append("\n");
        }
        System.out.println(sb);
    }
}
