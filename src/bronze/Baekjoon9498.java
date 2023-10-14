package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9498 {
    public static void main(String[] args) throws IOException{
        /* 시험 점수를 입력받아 90~100 A
                           80~89 B
                           70~79 C
                           60~69 D
        *                   나머지 F
        *    점수 0 < 점수 <= 100
        *
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int score = Integer.parseInt(str);
        char grade = ' ';

        if(score >= 90 ) {
            grade = 'A';
        } else if(80 <= score && score < 90 ){
            grade = 'B';
        } else if(70 <= score && score < 80) {
            grade = 'C';
        } else if(60 <= score && score < 70) {
            grade = 'D';
        } else
            grade = 'F';

        System.out.println(grade);
    }
}
