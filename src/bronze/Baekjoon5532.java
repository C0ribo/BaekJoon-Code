package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5532 {
    /*
    * 브론즈 4 - 방학 숙제
    *
    * 방학 총 날짜 L
    * 국어 총 페이지 A
    * 수학 총 페이지 B
    * 하루에 푸는 국어 최대 페이지 C
    * 하루에 푸는 수학 최대 페이지 D
    * L A B C D
    *
    * A / C
    * B / D
    * Math.max(값 비교해서) 큰 값을 L에서 빼준다.
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int vacationAll = Integer.parseInt(br.readLine());
        int krLangAll = Integer.parseInt(br.readLine());
        int mathAll = Integer.parseInt(br.readLine());
        int krLangDaily = Integer.parseInt(br.readLine());
        int mathDaily = Integer.parseInt(br.readLine());

        //int krLang =0; // 국어 나누기
        //int math = 0; // 수학 나누


        int krLang = 0; //krLangAll / krLangDaily;
        int math = 0; //mathAll / mathDaily;
        int duration = 0;

        if(krLangAll % krLangDaily != 0 && mathAll % mathDaily != 0){ // 국어와 수학의 나머지가 0이 아닐때
            krLang = krLangAll / krLangDaily;
            math = mathAll / mathDaily;
            int maxSubject = Math.max(krLang,math);
            duration = vacationAll - (maxSubject + 1);
        } else {
            krLang = krLangAll / krLangDaily;
            math = mathAll / mathDaily;
            int maxSubject = Math.max(krLang,math);
            duration = vacationAll - maxSubject;
        }

        //int maxSubject = Math.max(krLang,math);
        //int duration = vacationAll - maxSubject;

        sb.append(duration);
        System.out.println(sb);
    }
}
