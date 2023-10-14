package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10817 {
    /*
    * 브론즈 3 = 세 수
    *
    * A B C  예) 20 30 10
    * A B -> 비교1 20 30 -> 30
    * B C -> 비교2 30 10 -> 30
    * C A -> 비교3 10 20 -> 20
    *
    * 30 20 -> 30 젤 큼, 20이 두번쨰
    *
    * 비교1 비교2 -> 값1
    * 비교3 값1 -> 제일 큰거 , 제일 작은거
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int value = 0;


        if(a > b ){ // -> 두번쨰 b
            if(b > c)  //
                value = b;
             else if (a > c)
                value = c;
             else
                value = a;
        } else {
            if(a > c) // a 가 c
                value = a;
                else if(b > c)
                    value = c;
                else value = b;
        }
        sb.append(value);
        System.out.println(sb);
    }
}
