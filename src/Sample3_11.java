public class Sample3_11 {
    public static void main(String[] args){
        Car11 car1 = new Car11();

        car1.setStatus(123, 32.1);

        System.out.println("set num only");
        car1.setCar(343);

        System.out.println("set gas only");
        car1.setGas(13.3);

        car1.show();
    }
}
class Car11{
    private int num;
    private double gas;

    // Although name of the method is the same, it differes when the data type is different.
    void setCar(int n){
        num = n;
        System.out.println("set num " + num);
    }
    void setGas(double g){
        gas = g;
        System.out.println("set Gas " + gas);
    }
    void setStatus(int n, double g){
        num = n;
        gas = g;
        System.out.println("set num " + num + "\nset gas " + gas);
    }
    void show(){
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
    }
}