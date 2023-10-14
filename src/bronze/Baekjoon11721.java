package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11721 {
    /*
    * 브론즈 3 - 열 개씩 끊어서 출력
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine(); // 문자열 받는다.

        for(int i = 0; i<str.length(); i++){
            char strArr = str.charAt(i); // 문자열만큼 char에 넣는다.
            sb.append(strArr);

            if((i+1) % 10 == 0) // 문자열이 10의 배수일 때 다음으로 넘어간다.
                sb.append("\n");
        }
        System.out.println(sb);
    }
}
