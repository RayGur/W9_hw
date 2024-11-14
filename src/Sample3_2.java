public class Sample3_2 {
    public static void main(String[] args){
        Car2 car1 = new Car2();

        car1.num = 1234;
        car1.gas = 35.4;

        System.out.println("number is " + car1.num);
        System.out.println("gas is " + car1.gas);
    }
}
class Car2{
    int num;
    double gas;
        }