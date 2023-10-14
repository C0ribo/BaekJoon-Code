package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3046 {
    /*
     * 브론즈 4 - 3046
     *
     * R1 R2 S 가 있는데 결론은 R2 를 구하는 것이다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int r1 = Integer.parseInt(st.nextToken());
        int avgS = Integer.parseInt(st.nextToken());

        int r2 = (2 * avgS) - r1;
        sb.append(r2);
        System.out.println(sb);
    }
}