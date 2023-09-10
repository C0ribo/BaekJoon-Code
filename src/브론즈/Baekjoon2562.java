package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2562 {
    /*
     * 1. 9개 입력값을 만든다.
     * 2. 그 중 최대값을 찾는다. -> 배열의 최대값을 이용해서 찾는다.
     * 3. 최대값이 몇 번째 수인지 찾는다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arrNum = new int[9];
        int max = arrNum[0]; // 최대값 초기값 세팅
        int count = 0;

        for(int i = 0; i < 9; i++){ // 9번 입력할 수 있는 코드
            arrNum[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < arrNum.length; i++){ // 9개 배열 안에서
            if(arrNum[i] > max){ // 만약 arrNum[i]이 max보다 크다면
                max = arrNum[i]; // arrNum[i]을 max에 넣는다.
                count = i + 1; // 0부터 시작해서 인덱스 찾는용
            }
        }
        sb.append(max).append("\n").append(count );
        System.out.println(sb);
    }
}
