package bronze;

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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int sum = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum = A[i][j] + B[i][j];
                sb.append(sum).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
