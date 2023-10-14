package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2501 {
    /*
    * 브론즈 3 - 약수 구하기
    *
    * q % p == 0 -> q의  약수 중 p번째 작은수
    *
    * 6 3  6의 약수 중 3번째 작은 수 1 2 3 6
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 자연수 n
        int k = Integer.parseInt(st.nextToken()); // k번째 작은 수 입력

        int count = 0;
        int result = 0;

        for(int i = 1; i<= n; i++){

            if(n % i == 0){
                // 약수가 나올때마다 count + 1
                count++;
            }
            if(count == k){ // k가 count와 같아진다면
                result = i; // 약수 i는 result 값이 되고 멈춤
                break;
            }
        }
        sb.append(result).append(" ");
        System.out.println(sb);
    }
}
