package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10250 {
    /*
    * 브론즈 3 - ACM 호텔
    *
    * 방번호 YXX or YYXX -> Y, YY = 층수 XX = 엘베부터 센 번호
    *
    * 손님 = 이동거리 신경 x , 걷는 거리가 같을 때 아래층 선호
    * 미리 세로로 먼저 채우고 그다음에 세로 채우고 하는 식
    * 첫번쨰 줄 T -> 테스트 케이스 입력
    * 두번째 줄 H W N -> 호텔 층수 , 각 층의 방 수, 몇 번째 손님
    *
    * ex) 30 50 72 는 30층 한층당 50개 방 72번째 손님 -> 1203  30줄 | 30줄 | 12줄
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int y = 0;
        int x = 0;
        for(int i = 0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 호텔 층 수
            int w = Integer.parseInt(st.nextToken()); // 호텔 각 층당 방 수
            int n = Integer.parseInt(st.nextToken()); // 호텔에 온 n번쨰 손님


            if(n % h == 0){ // 층 수는 N번쨰 손님 % 층수 이다. 10번째 손님의 6층 건물이면 한층 채우고 다음 4층에 되기 떄문.
                y = h * 100; // 나머지가 0일때 그 층이 배정받는 층이다.
                x = n / h;
            }
            else{
                y = (n % h) *100;
                x = (n/h)+1;
            }
            int XXYY = y + x;
            sb.append(XXYY).append("\n");
        }
        System.out.println(sb);
    }
}
