package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10807 {
    public static void main(String[] args) throws IOException {
        /*
        * N : 총 정수 개수 입력했을 때
        * 둘째 줄에는 정수와 공백으로 이루어짐
        * n : 찾으려고 하는 정수 v 가 존재 -> 몇개 있는지 출력
        *
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 선언
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st= new StringTokenizer(br.readLine());
        //StringBuilder sb = new StringBuilder();

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken()); //원하는 개수만큼 배열 입력
        }
        int v = Integer.parseInt(br.readLine()); // 새로 입력
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
