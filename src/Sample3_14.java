public class Sample3_14 {
    public static void main(String[] args){
        Car14 car1 = new Car14();
        car1.show();

        Car14 car2 = new Car14(123, 45.2);
        car2.show();

    }
}
class Car14{
    private int num;
    private double gas;

    Car14(){
        num = 0;
        gas = 0;
        System.out.println("Car14 Constructor");
    }
    
    Car14(int n, double g){
        this();
        this.num = n;
        this.gas = g;
        System.out.println("Car14 Constructor num = " + num + ", gas = " + gas);
    }

    void show(){
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}