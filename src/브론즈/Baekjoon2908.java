package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    /*
    * 브론즈 2
    * 두 숫자를 입력받아서, 각각의 숫자를 뒤집고 두 수를 비교해서 큰 수를 출력하는것
    * */
    public static void main(String[] args) throws IOException {
        input();
    }
    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
    }

    private static void oppositionNum(){ // 숫자를 반대로 바꿔준다.
        // 먼저 int형의 숫자를 문자 String형으로 바꿔주고 반복문을 이용해 뒤집거나 또는 reverse() 사

    }
}
