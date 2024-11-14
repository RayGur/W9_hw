public class Sample3_17{
    public static void main(String[] args){
        String str = "Hello";

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        int len = str.length();

        System.out.println("The first alphabet of Hello is " + ch1);
        System.out.println("The second alphabet of Hello is " + ch2);
        System.out.println("There are " + len + " alphabets in Hello");

    }
}