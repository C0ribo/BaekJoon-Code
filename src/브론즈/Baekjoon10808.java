package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10808 {
    /*
    * 브론즈 4 - 10808
    *
    * String으로 단어를 입력 받아서 그 단어 속 a - z까지 각각 몇 개가 포함되어있는지 출력하시오
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] count = new int[26]; // 알파벳 개수를 저장하는 배열

        String str = br.readLine(); // 단어 입력받기

        for(int i = 0; i<str.length(); i++){ // 알파벳 배열 한번씩 둘러주기
            char c = str.charAt(i); // 입력한 문자열을 char형으로 나눠주기
            count[c - 97]++; // a의 아스키코드는 97이기 때문에 빼줘야 한다.
        }
        for(int i = 0; i<26; i++){
            sb.append(count[i]).append(" ");
        }
        System.out.println(sb);
    }
}
