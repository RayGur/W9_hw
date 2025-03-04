import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_21 {
    public static void main(String[] args)throws IOException {
        System.out.println("input two integers");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math.max(num1, num2);

        System.out.println("the larger one among " + num1 + " and " + num2 + " is " + ans);
    }
}
