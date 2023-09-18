package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1085 {
    /*
    * 브론즈 3 - 직사각형에서 탈출
    *
    * x , w-x , y , h-y
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int wh = w - x;
        int hy = h - y;

        int minValue = Math.min(x, wh);
        int minValue2 = Math.min(y, hy);

        int result = Math.min(minValue, minValue2);
        sb.append(result);
        System.out.println(sb);
    }
}
