package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3003 {
    /*
    * 브론즈 5 - 3003
    *
    * 체스 총 16개 -> 킹 1 , 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8
    * 흰색 수가 주어졌을 때 -> 몇 개 더하거나 뺴야 올바른지 구하는 문제
    *
    * 0 <= x <= 10
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 처음에 st.nextToken을 사용하지 않았을때  NumberFormatException 오류 발생 -> 원인: StringTokenizer없이 공백이 포함되었기 떄문
        // st.nextToken으로 바꿔주었더니 값이 출력되었다.

        int kingChess = Integer.parseInt(st.nextToken());
        int queenChess = Integer.parseInt(st.nextToken());
        int lookChess = Integer.parseInt(st.nextToken());
        int beshopChess = Integer.parseInt(st.nextToken());
        int knightChess = Integer.parseInt(st.nextToken());
        int poneChess = Integer.parseInt(st.nextToken());

        int chess1 = 1 - kingChess ;
        int chess2 = 1 - queenChess;
        int chess3 = 2 - lookChess;
        int chess4 = 2 - beshopChess;
        int chess5 = 2 - knightChess;
        int chess6 = 8 - poneChess;

        sb.append(chess1).append(" ")
                .append(chess2).append(" ")
                .append(chess3).append(" ")
                .append(chess4).append(" ")
                .append(chess5).append(" ")
                .append(chess6).append(" ");
        System.out.println(sb);
    }
}
