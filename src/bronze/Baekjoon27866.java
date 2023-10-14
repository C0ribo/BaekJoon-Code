package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon27866 {
    /*
    * 브론즈 5 - 문자와 문자열
    *
    * S문자열 입력 후에
    * i번째 숫자를 출력하는 프로그램
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char arr = str.charAt(i-1); // 배열의 시작이 0부터 이기때문에 -1을 해줌으로써 해당 번호에 있는 단어를 안다.
        sb.append(arr);
        System.out.println(sb);
    }
}
