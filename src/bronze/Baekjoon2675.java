package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2675 {
    /*
       (0) 몇번 입력받을 건지 T
    * (1) 문자열 S 입력
    * (2) 문자별 R번 반복 -> 문자열 P를
    배열로 밖에 못품
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){ // 테스트 케이스 T회
            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken()); // 문자열 반복 시킬만큼 R
            String S = st.nextToken(); // 반복할 문자
            char[] arr1 = S.toCharArray(); // 문자열을 배열로 하나하나 하기

            for(int j = 0; j <arr1.length; j++){ // 배열을 쭉 훑어야함
                for(int k = 0; k < R; k++){
                    sb.append(arr1);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
