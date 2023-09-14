package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2480 {
    /*
    * 브론즈 4 - 2480 주사위 세개
    * 주사위 3개를 던지는데
    * 1. 같은 눈 3개 -> 10000 + (같은 눈) * 1000
    * 2. 같은 눈 2개 -> 1000 + (같은 눈) * 100
    * 3. 모두 다른 눈 -> (가장 큰 눈) * 100
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int diceA = Integer.parseInt(st.nextToken()); // 주사위 1
        int diceB = Integer.parseInt(st.nextToken()); // 주사위 2
        int diceC = Integer.parseInt(st.nextToken()); // 주사위 3

        int price = 0;

        if(diceA == diceB && diceB == diceC && diceC == diceA ){ // 3개가 동일할 떄
            price = 10000 + (diceA * 1000); // 값을 계산하고
            sb.append(price);
        } else if(diceA == diceB || diceA == diceC){ // 2개만 같을 경우 a가 b 또는 C와 같을 경우
            price = 1000 + (diceA * 100);
            sb.append(price);
        } else if (diceB == diceC) { // b와 c가 같을 경우
            price = 1000 + (diceB * 100);
            sb.append(price);
        } else { // 3개가 다를떄
            int max = Math.max(diceA, Math.max(diceB, diceC));
            price = max * 100;
            sb.append(price);
        }

        System.out.println(sb);
    }
}
