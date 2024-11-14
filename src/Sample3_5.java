public class Sample3_5 {
    public static void main(String[] args) {
        Car5 car1 = new Car5();

        car1.num =1234;
        car1.gas = 35.4;

        car1.showCar();
    }
}
class Car5{
    int num;
    double gas;

    void show(){
        System.out.println("number is " + num);
        System.out.println("gas is " + gas);
    }

    void showCar(){
        System.out.println("Show car status");
        this.show();
    }
}