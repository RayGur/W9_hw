public class Sample3_8 {
    public static void main(String[] args) {
        Car8 car1 = new Car8();
        car1.setStatus(213, 32.3);
        int number = car1.getNum();
        double gasoline = car1.getGas();
        System.out.println("got num " + number + "\ngot gas " + gasoline);
    }
}
class Car8{
    int num;
    double gas;

    int getNum(){
        System.out.println("getting num");
        return num;
    }

    double getGas(){
        System.out.println("getting gas");
        return gas;
    }

    void setStatus(int n, double g){
        num = n;
        gas = g;
        System.out.println("set num to " + num + " \nset gas to " + gas);
    }
}