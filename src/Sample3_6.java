public class Sample3_6 {
    public static void main(String[] args) {
        Car6 car1 = new Car6();

        car1.setNum(1234);
        car1.setGas(34.2);
    }
}
class Car6{
    int num;
    double gas;

    void setNum(int n){
        this.num = n;
        System.out.println(" set num to " + num);
    }

    void setGas(double g){
        this.gas = g;
        System.out.println(" set gas to " + gas);
    }
}
