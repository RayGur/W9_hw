public class Sample3_22 {
    public static void main(String[] args) {
        System.out.println("declare car1");
        Car22 car1 = new Car22();
        car1.setCar(123, 2.3);

        System.out.println("declare car2");
        Car22 car2;

        System.out.println("assign car1 to car2");
        car2 = car1;

        car1.show();
        car2.show();

        car1.setCar(333, 23.1);

        car1.show();
        car2.show();


    }
}
class Car22 {
    private int num;
    private double gas;

    public Car22() {
        num = 0;
        gas = 0.0;
        System.out.println("made a car");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("set num to " + num + "\nset gas to " + gas);
    }

    public void show() {
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}
