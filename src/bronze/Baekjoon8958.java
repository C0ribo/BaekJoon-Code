package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958 {
    /*
    * O = 맞은 문제
    * X = 틀린 문제
    * OOXXOXXXOOO = 1 + 2 + 0 + 0 + 1 + 0 + 0 + 1 + 2 + 3 = 10
    * 연속적으로 맞는 거 만큼 연속적으로 늘지만, 틀리는 순간 리셋되고, 다시 맞으면 1씩 쌓임
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스를 입력하면 그만큼 생긴다.

        for(int i = 0; i < testCase; i++){ // 테스트 케이스만큼 입력할 수 있는걸 for문으로 만든다.
            // o랑 x를 입력하는 걸 만든다.
            // 문자열은 자유잖아 . 0~80개 사이로 만드는데 String으로 받아서 char로 쪼개기
            String ox = br.readLine(); // string으로 입력받는것을 성공했다.
            char[] arrOX = ox.toCharArray(); // string -> char 형변환 배열로 쪼개기

            int cnt = 0; // 연속 수
            int result = 0; // 결과값

            // O 일때 1, X일때 0
            for (int j = 0; j<arrOX.length; j++) { // 입력한 문자열을 char 배열로 바꾸고 한번 훑어주기 위한
                if (arrOX[j] == 'O') { // arrOX 배열 안에 O일때 -> 숫자 1이 생겨야댐
                    cnt++; // 근데 누적 합이어야함 연달아오는 O일 경우에는
                    result += cnt; // 누적합을 더해줌
                }
                else if (arrOX[j] == 'X') { // X일때는 숫자 -> O이 생겨야댐
                    cnt = 0; // 0일떄 리셋
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
