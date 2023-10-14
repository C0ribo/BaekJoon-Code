package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14681 {
    public static void main(String[] args) throws IOException {
        /*
        * 1사분면 (양수, 양수)
        * 2사분면 (음수, 양수)
        * 3사분면 (음수, 음수)
        * 4사분면 (양수, 음수)
        *
        * 정수 x (-1000 <= x <= 1000, x != 0)
        * 정수 y (-1000 <= y <= 1000, y != 0)
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String str = br.readLine();
        //StringTokenizer st = new StringTokenizer(str, "\n");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int result;

        if(x > 0){ // 만약 x 가 양수
            if(y > 0) {// y가 양수라면
                result = 1;
            } else {
                result = 4;
            }
        }else { // x가 음수
            if(y > 0){ // 음수, 양수
                result = 2;
            } else {
                result = 3;
            }
        }
        System.out.println(result);
    }
}
