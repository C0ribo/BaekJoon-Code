package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5596 {
    /*
    * 브론즈 4 - 시험 점수
    * 민국 -> 정보 수학 과학 영어
    * 만세 -> 정보 수학 과학 영어
    * S = 정보 + 수학 + 과학 + 영어
    * T = 정보 + 수학 + 과학 + 영어
    * Math.max(S, T)
    * if(S ==  T ) -> S
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mingukInfo = Integer.parseInt(st.nextToken());
        int mingukMath = Integer.parseInt(st.nextToken());
        int mingukSci = Integer.parseInt(st.nextToken());
        int mingukEng = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int manseiInfo = Integer.parseInt(st.nextToken());
        int manseiMath = Integer.parseInt(st.nextToken());
        int manseiSci = Integer.parseInt(st.nextToken());
        int manseiEng = Integer.parseInt(st.nextToken());

        int mingukT = mingukInfo + mingukMath + mingukSci + mingukEng;
        int manseiS = manseiInfo + manseiMath + manseiSci + manseiEng;

        int compare = Math.max(mingukT, manseiS);

        if(mingukT == manseiS){
            sb.append(mingukT);
        } else {
            sb.append(compare);
        }

        System.out.println(sb);
    }
}
