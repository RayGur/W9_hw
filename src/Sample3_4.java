public class Sample3_4 {
    public static void main(String[] args){
        Car4 car1 = new Car4();

        car1.num = 2341;
        car1.gas = 3.2;

        car1.show();
        car1.show();
    }
}
class Car4{
    int num;
    double gas;

    void show(){
        System.out.println("nume is "  + num);
        System.out.println("gas is " + this.gas);
    }
}