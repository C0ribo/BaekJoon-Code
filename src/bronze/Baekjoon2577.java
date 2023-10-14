package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2577 {
    /*
    * 브론즈 2 숫자의 개수
    *
    * 숫자 A B C 를 입력 받아서 A x B x C를 해주고
    * 계산한 결과를 0부터 9까지 숫자를 나열하고
    * 그 결과값에 나열된 숫자가 몇개 있는지 출력하는 문제
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int multipler = a * b * c;
        int[] num = new int[10];
        char[] arr = String.valueOf(multipler).toCharArray();

        for(int i = 0; i<arr.length; i++) { // multipler 만큼의 길이 생성
            char ch = arr[i];
            int index = Integer.parseInt(String.valueOf(ch));
            num[index]++;
        }
        for (int j : num) {
            sb.append(j).append("\n");
        }
        System.out.println(sb);
    }
}
