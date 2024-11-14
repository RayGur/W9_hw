import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Sample3_7 {
    public static void main(String[] args){
        Car7 car1 = new Car7();

        int number = 1234;
        double gasoline = 23.12;

        car1.setStatus(number, gasoline);

    }
}
class Car7{
    int num;
    double  gas;

    void setStatus(int n, double g){
        this.num = n;
        this.gas = g;
        System.out.println("set num to " + num + " \nset gas to " + gas);
    }
}