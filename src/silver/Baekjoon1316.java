package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i<input; i++){ // 테스트 케이스 입력
            String str = br.readLine(); // String 입력
            char[] strArr = new char[str.length()]; // 입력한 문자열을 각각 char형에 문자열길이만큼 배열 생성

        }
        System.out.println(sb);
    }
}
