package 브론즈;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15552 {
    /*
    * 조건
    * Scanner와 System.out.println ->
    *
    * BufferedReader, BufferedWriter, BufferedWriter.flush 마지막 1번
    *
    * 먼저 몇개를 테스트할 생각인지 input 한다.
    * 그 개수만큼 A, B 나타나고 A + B한다.
    *
    * BufferedWriter를 못쓸거 같으면 StringBuilder를 사용하여
    * System.out.println을 써도 괜찮다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()); // 몇 개 입력값

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int i = 1; i<= input; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            sb.append(num1 + num2);
            sb.append("\n");

        }
        System.out.println(sb);
    }

}
