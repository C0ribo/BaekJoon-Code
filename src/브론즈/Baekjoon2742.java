package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2742 {
    /*
     * 자자 차근차근 생각해보자고
     * 1. 입력값 N을 만들고
     * 2. 입력한 N순으로 -1되어서 차례차례 출력 charAt(i)로 받아서 빼야할 거 같은데
     * charAt(0) -> 48
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // N 입력

        int result = 0;

        for(int i = N; i > 0; i--){ // i는 N부터 시작해서 0보다 크고 1씩 줄어든다.
            /* 5
            *  4
            * */
            // st = new StringTokenizer(br.readLine(), "\n"); -> 어차피 출력문때 \n이라서 append에 넣으면 됫 얘는 필요없을듯

            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
