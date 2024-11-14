import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_20 {
    public static void main(String[] args)throws IOException {
        System.out.println("Input a string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println("what you wanna add after the string");
        String strAdd = br.readLine();

        StringBuffer sb = new StringBuffer(str);
        sb.append(strAdd);

        System.out.println("adding " + str + " to " + strAdd + " would be : " + sb.toString());
    }
}
