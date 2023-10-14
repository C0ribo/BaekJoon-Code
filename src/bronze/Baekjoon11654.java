package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11654 {
    /*
    * 브론즈 5 - 11654
    * 소문자, 대문자 , 숫자 0 - 9 중 하나 입력했을 때, 이스키 코드 값을 출력한다.
    * 내 생각 : String으로 받아서 charAt로 뽑아낸다.
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //String str = br.readLine();
        //char ch = str.charAt(0);
        int ch2 = br.readLine().charAt(0);

        sb.append(ch2);
        System.out.println(sb);

    }
}
