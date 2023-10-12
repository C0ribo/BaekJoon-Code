package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        int[] arr = new int[test]; // 테스트코드만큼 배열 만들어주기
        for(int i = 0; i<test; i++){ // 테스트 코드만큼 입력 받아주기
            arr[i] = Integer.parseInt(br.readLine()); // 배열에 넣을 숫자 입력하기
        }
        Arrays.sort(arr); // 배열 오름차순 정렬하기
        for (int result : arr) { // 배열 훑어주기
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
