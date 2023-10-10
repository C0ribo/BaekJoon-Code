package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2675_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; //= new StringTokenizer(br.readLine(), " ");

        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i < input; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            char[] strArr = str.toCharArray(); // 문자열 받은거 배열로 쪼개기

            for(int j = 0; j<strArr.length; j++){// 배열 만들어준 길이만큼 훑는다.
                for(int k = 0; k < num; k++){ // 입력한 숫자만큼 배열을 반복시켜야 한다.
                    sb.append(strArr[j]); // 나타낸 문자열 [만큼의 배열을] 갯수만큼 반복
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
