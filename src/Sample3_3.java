public class Sample3_3 {
    public static void main(String[] args){
        Car3 car1 = new Car3();
        Car3 car2 = new Car3();

        car1.num = 244;
        car1.gas = 38.2;

        car2.num = 391;
        car2.gas = 53.1;

        System.out.println("car1 num is " + car1.num);
        System.out.println("car1 gas is " + car1.gas);

        System.out.println("car2 num is " + car2.num);
        System.out.println("car2 gas is " + car2.gas);
    }
}
class Car3{
    int num;
    double gas;
}