package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjoon1271 {
    /*
    * 브론즈 5 - 엄청난 부자 2
    *
    * 가진 돈 입력 m
    * 나눠갖으려는 사람 n명
    * m / n 출력
    * m % n 출력
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //String str = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger m = new BigInteger(st.nextToken());
        BigInteger n = new BigInteger(st.nextToken());

        sb.append(m.divide(n)).append("\n").append(m.remainder(n));
        System.out.println(sb);
    }
}
