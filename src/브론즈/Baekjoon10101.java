package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10101 {
    /*
    * 브론즈 4 - 10101
    * 세 각을 각각 입력하고
    * A + B + C = 60 -> Equilateral
    * A + B + C = 180, 두 각이 같으면 Isosceles
    * A + B + C = 180, 같은 두각이 없는 경우 Scalene
    * A + B + C != 180 Error
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a + b + c != 180){  // 세 각을 더한게 180이 아니면 삼각형이 아니다.
            sb.append("Error");
        } else { // 세각을 더했을 때 180일때
            if( a == b && b == c && c == a){ // 세 변이 같을 경우
                sb.append("Equilateral");
            } else if(a == b || b == c || c == a){ //두 각이 같을 경우 이등변삼각형
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
        }

        System.out.println(sb);
    }
}
