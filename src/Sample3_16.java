import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_16{
    public static void main(String [] args)throws IOException{
        System.out.println("input an integer");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br1.readLine());
    }
}