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
        st = new StringTokenizer(br.readLine());

        //int max = arrNum[0]; // 최대
        //int min = arrNum[0]; // 최소

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            arrNum[i] = Integer.parseInt(st.nextToken()); // 원하는 만큼 배열입력
        }

        for(int i : arrNum){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

//        for(int i = 0; i< arrNum.length; i++){
//            if(arrNum[i] > max){ // 최대
//                max = arrNum[i];
//            }
//            if(arrNum[i] < min){ // 최소
//                min = arrNum[i];
//            }
//        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
