package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        /*
        * 언제 종료되는지 몰랐는데 null을 입력해야한다.
        * 더이상 입력값이 없을 때 종료한다고 하고 쓰는것이다.
        *
        * */
        while((str=br.readLine()) != null){
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B);
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
