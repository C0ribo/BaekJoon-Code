package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2753 {
    public static void main(String[] args) throws IOException {
        /*
        * 윤년 -> 1 , 아니면 -> 0
        * 윤년 = 연도가 4의 배수, 100의 배수가 아닐 때 또는 400의 배수일 때
        * ex) 2012년 = 4의 배수, 100의 배수가 아니라서 윤년
        *     1900년 = 4의 배구, 100의 배수이고 400의 배수가 아니다.
        *     2000년 = 4의 배수, 400의 배수이기 때문에 윤년
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if(year%4==0) {
            if (year%100!=0 || year%400==0) {
                System.out.println("1");
            } else
                System.out.println("0");
        } else System.out.println("0"); // 4의 배수가 아니면
    }
}

