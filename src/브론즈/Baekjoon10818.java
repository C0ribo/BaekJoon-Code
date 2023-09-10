package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10818 { // 2562 번 문제와 연계문제
    /*
    * 1. 몇개 입력할 것인지 하는 입력문 작성
    * 2. N개의 숫자를 공백과 함께 작성
    * 3. 최솟값 구하기
    * 4. 최댓값 구하기
    * 5. 최소 최대 순으로 나열 append(" ")
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arrNum = new int[N];
        int max = arrNum[0];
        int min = arrNum[0];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arrNum[i] = Integer.parseInt(st.nextToken());

            for(int j = 0; j < arrNum.length; j++)
        }


        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
