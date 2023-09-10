package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2741 {
    public static void main(String[] args) throws IOException {
        /*
        * 자연수 N이 주어졌을 때, 1~N까지 나열 출력
        * 반복문
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        //br.close();

//        int i = 1;
//        while(i<=num){
//            System.out.println(i);
//            i++;
//        }
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }

    }
}
