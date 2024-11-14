public class Sample3_13 {
    public static void main(String[] args){
        Car13 car1 = new Car13();
        car1.show();

        Car13 car2 = new Car13(123, 2.3);
        car2.show();
    }
}
class Car13{
    private int num;
    private double gas;

    public Car13(){
        num = 0;
        gas = 0.0;
        System.out.println("Car13 Constructor");
    }
    public Car13(int n, double g){
        num = n;
        this.gas = g;
        System.out.println("Car13 Constructor num " + num + ", gas " + gas);
    }
    void show(){
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}