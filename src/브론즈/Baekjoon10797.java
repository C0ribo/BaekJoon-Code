package 브론즈;

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
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int day = Integer.parseInt(br.readLine()); // 일의 날짜 입력
//        int cnt = 0;
//
//        for(int i = 0; i< 5; i++){
//            int carNum = Integer.parseInt(st.nextToken());
//            if(day == carNum){ // day 와 arrCar 이 같으면
//                // 몇개인지 알아야한다.
//                cnt++;
//            }
//            sb.append(cnt);
//        }
//        //sb.append(cnt);
//        System.out.println(sb);
//
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());

            if(arr[i] == day)
                count++;
            sb.append(count);
        }
        System.out.println(sb);
    }
}

