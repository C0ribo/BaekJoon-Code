package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2884 {
    /* 상근이가 입력한 시간과 분 : H M
    * 입력 시간 24시간 표현 (0 : 0 ~ 23 : 59)
    *  출력 : 45분 앞으로 땡긴다.
    * 시간이랑 분을 나눠서 입력한다. (공백 사용)
    * 시간과 분에 제어문 걸기?
    * 45분 보다 작으면 hour -1
    *       분이 작으면 시 -1했을 때 0보다 작을 수 있어서 시를 23시로 고정
    * 45분 보다 크면 minute -45
    *       분은 60분이에 입력값이 45보다 작아서 시 -1를 해주면 minute은 60 - (45 - 분)이 된다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 시간 입력
        int hour = Integer.parseInt(st.nextToken());
        // 분 입력
        int minute = Integer.parseInt(st.nextToken());

        minute = minute - 45;
        if(minute < 0){
            hour--;
            minute += 60;
        }

        if(hour < 0)
            hour = 23;

        sb.append(hour).append(" ").append(minute);
        System.out.println(sb);
    }
}
