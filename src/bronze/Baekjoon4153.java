package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4153 {
    /*
    * 브론즈 3 - 직각 삼각형
    *
    * 0 0 0 입력하면 종료이므로 while(true) ..
    * a^2 + b^2 = c^2
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c ==0) break;

            /*int trangle = (a * a) + (b * b);
            int last = (c * c);
            int aa = (int)Math.pow(a, 2);
            int bb = (int)Math.pow(b, 2);
            int cc = (int)Math.pow(c, 2);
            */

            if((a * a) == (b * b) + (c * c) ){
                sb.append("right");
            } else if ((b * b) == (a * a) + (c * c)) {
                sb.append("right");
            } else if((c * c) == (a * a) + (b * b)){
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
