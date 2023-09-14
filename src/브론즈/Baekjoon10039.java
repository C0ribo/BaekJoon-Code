package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10039 {
    /*
    * 브론즈 4 - 평균점수
    *
    * 학생은 5명
    * 시험점수 >= 40 -> 그 성적 그대로 반영
    * 시험점수 <= 40 -> 40점 유지
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int score = 0;
        int sum = 0;
        int avg = 0;

        for(int i = 1; i<= 5; i++){
            int point = Integer.parseInt(br.readLine()); // 시험점수 입력

            if(point >= 40){ // 40점 이상이면
                score = point;
            } else { // 40점 이하이면
                score = 40; // 40점 그대로 유지
            }
            sum += score;
            avg = sum / 5;
        }
        sb.append(avg);
        System.out.println(sb);
    }
}
