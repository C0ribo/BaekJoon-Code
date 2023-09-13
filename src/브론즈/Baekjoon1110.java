package 브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1110 {
    /*
    * 숫자 N을 입력한다.
    * 1. N < 10 -> 앞에 0을 붙여 두자리 0X
    * 2. 각자리의 숫자를 더한다.
    *  N = 26 -> (각 자리 더해서) 2 + 6 = 8 -> (오른쪽 숫자 + 합) 새로운 수 68 -> (각 자리 더해서) 6 + 8 = 14 -> 새로운 수 84 -> 8 + 4 = 12 -> 새로운 수 42 -> 4 + 2 = 6 -> 새로운 수 26 : 총 4회
    *  N = 55 -> 5 + 5 = 10 -> 새로운 수 50 -> 5 + 0 = 5 -> 새로운 수 05 -> 0 + 5 = 5 -> 새로운 수 55 : 총 3회
    *  N = 1 -> 01 = 0 + 1 = 1 -> 새로운 수 11 -> 1 + 1 = 2 -> 새로운 수 12 -> 1 + 2 = 3 -> 새로운 수 23 ... 60회
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       // String str = br.readLine();

        int N = Integer.parseInt(br.readLine()); // 숫자 N 입력 만약 26을 입력한다면?
        //String N = br.readLine(); // -> String으로 입력받을 경우 -> 입력 받은 것을 char로 쪼갠다.
         /*
         int로 받은걸 char로 쪼개기를 어케하지?
         2랑 6을 분리한다. -> 이후에 2 + 6을 해야하기 때문에
         각각 숫자 분리하는 법 char로 쪼개기?
         */
        //char[] numArr = N.toCharArray(); // -> 각 자리를 배열로 만들어서 해줘야 하나 ???
        //for(int i = 0; i < numArr.length; i++){ // 생성한 배열 훑기
       // }

        int cnt = 0;
        int T = N;


        /* N 이 10보다 작을 때 앞에 0을 붙인다는 조건이 있다. */
        if(N > 10){ // N이 10보다 크면 각 자리수를 더한다.
            int ten = (N / 10); // 10의 자리 구하기
            int ill = ( N % 10); // 1의 자리 구하기
            int sum = ten + ill; // 10의 자리 수와 1의 자리수 더하기
            int sum2 = (sum%10)+(ill * 10);// 더한수가 일의 자리가 되고 원래 일의 자리였던 게 10의 자리 수가 된다.
            sb.append(sum2);
        }
        while(true){ // true일동안 계속 돈다.
            N = ((N % 10) * 10) + (((N / 10) + (N%10)) % 10);
            cnt++;
            if(T == N)
                break;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
