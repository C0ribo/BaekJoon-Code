package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11365 {

    /*
    * 브론즈 4 - 밀비급일
    *
    * 문자열 뒤집는 문제
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("END")) break;
            StringBuilder reverseStr = new StringBuilder(str);
            reverseStr = reverseStr.reverse();
            sb.append(reverseStr).append("\n");
        }
        System.out.println(sb);
    }

}
