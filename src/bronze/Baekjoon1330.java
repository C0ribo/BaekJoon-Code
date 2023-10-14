package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon1330 {
    public static void main(String[] args) throws IOException {
        // 정수 A, B를 입력받았을 때
        // A랑 B는 공백 한 칸으로 구분 되어져 있다.
        // A > B 일 경우 '>' 출력
        // A < B 일 경우 '<' 출력
        // A = B 일 경우 '==' 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        // readLine()으로 받은 String값을 int로 형변환
        int num1 = Integer.parseInt(st.nextToken()); // 숫자 입력 받을 때
        int num2 = Integer.parseInt(st.nextToken()); // 숫자 입력 받을 때

        if(num1 > num2){
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
