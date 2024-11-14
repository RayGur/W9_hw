import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample3_19{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string ");

        String str = br.readLine();

        System.out.println("Witch word you would like to find? ");

        char ch = br.readLine().charAt(0);

        int num = str.indexOf(ch);

        if(num != -1){
            System.out.println(ch + " is at index " + num);
        }else{
            System.out.println("can't find the word " + ch);
        }
    }
}