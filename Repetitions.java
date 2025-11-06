import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        int left = 0, right = 0;
        int maxLen = 0;
        while(right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                maxLen = Math.max(maxLen, right- left + 1);
            }
            else{
                left = right;
            }
            right++;
        }
        System.out.println(maxLen);
    }
}
