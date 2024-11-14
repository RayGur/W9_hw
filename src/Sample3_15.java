public class Sample3_15{
    public static void main (String[] args){
        Car15.showSum();

        Car15 car1 = new Car15();
        car1.setCar(123,5.2);
        car1.show();

        Car15 car2 = new Car15();
        car2.setCar(444, 32.3);
        car2.show();

        Car15.showSum();

    }
}
class Car15{

public static int sum = 0;
    private int num;
    private double gas;

    public Car15(){
        num = 0;
        gas = 0;
        sum ++;
        System.out.println("made a car");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("set num to " + num + "\nset gas to " + gas);
    }

    public static void showSum(){
        System.out.println("Sum: " + sum);
    }

    void show(){
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}