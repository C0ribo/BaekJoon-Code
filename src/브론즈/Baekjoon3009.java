package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    /*
    * 브론즈 3 - 3009 네번째 점
    *
    * 3점이 주어졌는데, 직사각형을 만들기 위한 네번째 점 찾는 거
    * */
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] x1 = new int[3];
        int[] y1 = new int[3];

        int x = 0;
        int y = 0;

        for(int i =0; i<3; i++){
            st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            y1[i] = Integer.parseInt(st.nextToken());
        }

        if(x1[0] == x1[1])
            x = x1[2];
        if(x1[0] == x1[2])
            x = x1[1];
        if(y1[0] == y1[1])
            y = y1[2];
        if(y1[0] == y1[2])
            y = y1[1];
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        if(x1 == x2 ){
            x = x3;
        } else if(x1 == x3){
            x = x2;
        } else {
            x = x1;
        }

        if(y1 == y2){
            y = y3;
        } else if(y1 == y3){
            y = y2;
        } else {
            y = y1;
        }

        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}
