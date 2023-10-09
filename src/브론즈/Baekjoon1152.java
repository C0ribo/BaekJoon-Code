package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = st.nextToken().trim(); // String 문자열 입력, 공백제거
        st = new StringTokenizer(br.readLine(), str); // 단어는 공백하나로 구분

        // countTokens으로 토큰의 개수를 출력한다.(int형) -> countTokens = StringTokenizer에서만 쓸 수 있나봄
        //int strNum = Integer.valueOf(str); // string -> int
        int count = st.countTokens();
        
        sb.append(count).append(" ");
        System.out.println(sb);
    }
}
