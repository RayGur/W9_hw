public class Sample3_10 {
    public static void main(String[] args) {
        Car10 car1 = new Car10();

        car1.setStatus(123,4.4);
        car1.show();

        System.out.println("trying wrong gas");

        car1.setStatus(222, -33);
        car1.show();
    }
}
class Car10{
    private int num;
    private double gas;

    void setStatus(int n, double g){
        if(g > 0 && g < 100){
            num = n;
            gas = g;
            System.out.println("set num to " + num + " \nset gas to " + gas);
        }else{
            System.out.println(gas + " is not correct");
            System.out.println(" can't set gas");
        }
    }

    void show(){
        System.out.println("number is " + num);
        System.out.println("gas is " + gas);
    }
}
