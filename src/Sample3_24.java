public class Sample3_24 {
    public static void main(String[] args) {
        Car24[] cars = new Car24[3];

        for (int i = 0 ; i < cars.length; i++){
            cars[i] = new Car24();
        }

        cars[0].setCar(123, 32);
        cars[1].setCar(13, 3.2);
        cars[2].setCar( 23, 32.55);

        for (int i = 0; i < cars.length; i++){
            cars[i].show();
        }
    }
}
class Car24{
    int num;
    double gas;

    public Car24() {
        num = 0;
        gas = 0.0;
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("set num to " + num + " set gasoline to " + gas);
    }

    public void show() {
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}
