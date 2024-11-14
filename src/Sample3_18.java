import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample3_18{
    public static void main(String[] args)throws IOException{
        System.out.println("input a English word");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String wrd = br.readLine();

        String upperWrd = wrd.toUpperCase();
        String lowerWrd = wrd.toLowerCase();

        System.out.println("The upper case of the word is " + upperWrd);
        System.out.println("The lower case of the word is " + lowerWrd);
    }
}