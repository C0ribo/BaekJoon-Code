package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10797 {
    /*
    * 브론즈 4 - 10797
    *
    * 날짜 일의 자리를 입력했을 때 차량 5대 중에 그 숫자와 동일한 수가 몇개인지 찾으시오
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<5; i++){
            int carNum = Integer.parseInt(st.nextToken());
            if(day == carNum){
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}

