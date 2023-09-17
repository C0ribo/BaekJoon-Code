package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1264 {
    /*
    * 브론즈 4 - 모음의 개수
    *
    * a e i o u를 써서 개수 찾기
    * 문자열로 받기 -> charAt 로 빼주기
    * #을 눌렀을 때 종료
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){ // 무한루프
            String str = br.readLine().toLowerCase(); // String 입력값 받기
            int cnt = 0;
            if(str.equals("#")) // -> # 일경우 무한루프 종료
                break;
            for(int i = 0; i<str.length(); i++){ // str.length를 통해 str의 처음부터 끝까지 진행
                switch (str.charAt(i)){ // str.charAt(i)는 i번쨰 값을 가지고 온다.
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cnt++; // 조건에 맞으면 count 증가
                    default:
                        break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
