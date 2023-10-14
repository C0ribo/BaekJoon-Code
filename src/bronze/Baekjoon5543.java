package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5543 {
    /*
    * 브론즈 4 - 5543
    *
    * 제일 싼 버거 + 제일 싼 음료 - 50 = 출력
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int highBurger = Integer.parseInt(br.readLine()); // 상덕 버거
        int middleBurger = Integer.parseInt(br.readLine()); // 중덕 버거
        int lowBurger = Integer.parseInt(br.readLine()); // 하덕 버거

        int cola = Integer.parseInt(br.readLine()); // 콜라
        int cider = Integer.parseInt(br.readLine()); // 사이다

        int lowPriceBurger = Math.min(highBurger, Math.min(middleBurger, lowBurger));
        int lowPriceDrink = Math.min(cola, cider);

        int setBurger = (lowPriceBurger + lowPriceDrink) - 50;

        sb.append(setBurger);
        System.out.println(sb);
    }
}
