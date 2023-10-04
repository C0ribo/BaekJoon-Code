import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCutting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arrWord = str.split("");

        for(int i = 0; i<arrWord.length; i++){
            sb.append(arrWord[i]).append(" ");
        }
    }
}
