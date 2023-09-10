package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2738 {

    /*
    * 문제
    * 1. N M 를 입력한다. 다중 배열 사용??
    * 2. [1 1 1] [3 3 3]
    * 3. [2 2 2] [4 4 4]
    * 4. [0 1 0] [5 5 5]
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Bf 선언
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st; //= new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        //int[] arr1 = new int[N];
        //int[] arr2 = new int[M];
        int[][] arr = new int[N][M]; // [행][열]

        for(int i = 0; i <=N; i++){
            for(int j =0; j<= M; j++){
                st = new StringTokenizer(br.readLine(), " ");
            }

            //int indexA = Integer.parseInt(st.nextToken());

        }

    }
}
