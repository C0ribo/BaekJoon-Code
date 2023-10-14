package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2754 {
    /*
    * 브론즈 5 - 2754
    * 성적을 입력했을때 그 점수가 몇점인지 출력하시오.
    * switch case를 풀어야하나 고민중
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        switch (str) {
            case "A+":
                sb.append("4.3");
                break;
            case "A0":
                sb.append("4.0");
                break;
            case "A-":
                sb.append("3.7");
                break;
            case "B+":
                sb.append("3.3");
                break;
            case "B0":
                sb.append("3.0");
                break;
            case "B-":
                sb.append("2.7");
                break;
            case "C+":
                sb.append("2.3");
                break;
            case "C0":
                sb.append("2.0");
                break;
            case "C-":
                sb.append("1.7");
                break;
            case "D+":
                sb.append("1.3");
                break;
            case "D0":
                sb.append("1.0");
                break;
            case "D-":
                sb.append("0.7");
                break;
            case "F":
                sb.append("0.0");
                break;
        }
        System.out.println(sb);
    }
}
