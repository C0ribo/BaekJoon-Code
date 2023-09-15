package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2752 {
    /*
    * 브론즈 4 - 2752
    * 오름차순 정렬 - Arrays.sort()를 사용한다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] number = new int[3]; // 정렬할 배열

        for(int i = 0; i  < 3; i++){
            number[i] = Integer.parseInt(st.nextToken()); // 입력받은 수를 배열에 저장
        }
        Arrays.sort(number); // 배열 정렬하기

        for(int i =0; i < 3; i++){
            sb.append(number[i]).append(" ");
        }
        System.out.println(sb);
    }
}
