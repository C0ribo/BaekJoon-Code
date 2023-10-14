package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25304 {
    /*
    * 브론즈 4 - 25304
    *
    * 첫 줄 구매한 총 금액 X
    * 두번째 줄 구매한 물건 개수 입력 N
    * 세번째 줄 구매한 물건 가격 a , 그 물건 개수 b (공백)
    *
    * 만약 총 금액 X 와 찐 계산 Y 가 같다면 Yes 출력
    * 다르면 No 출력
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int priceX = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int priceY = 0;

        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 물건 가격입력
            int b = Integer.parseInt(st.nextToken()); // 물건 개수입력

            priceY += (a * b);
        }

        if(priceX == priceY){ // for문 안에 넣으니까 쓸데없이 똑같이 반복해서 출력한다.
            sb.append("Yes");
        } else {
            sb.append("No");
        }
        System.out.println(sb);
    }
}
