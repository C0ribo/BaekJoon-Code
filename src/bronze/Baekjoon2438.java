package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= star; i++){ // 1부터 star 수만큼 1씩 증가
            sb.append("*");
            System.out.println(sb);
        }

    }
}
//1 3 6 10