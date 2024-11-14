import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Sample3_9 {
    public static void main(String[] args) {
        Car9 car1 = new Car9();

        car1.num = 123;
        car1.gas = -2.31;

        car1.show();
    }
}
class Car9{
    int num;
    double gas;

    void show(){
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}