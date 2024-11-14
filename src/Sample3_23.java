public class Sample3_23 {
    public static void main(String[] args) {
        Car23 car1 =new Car23();

        car1.show();

        int number = 123;
        double gasoline =32.2;
        String name = "car1";

        car1.setCar(number, gasoline);
        car1.setName(name);

        car1.show();
    }
}
class Car23{
    private int num;
    private double gas;
    private String name;

    public Car23() {
        num = 0;
        gas = 0;
        name = "unnamed";
        System.out.println("made a car");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("set car number " + num + " gasoline " + gas);
    }

    public void setName(String name){
        this.name = name;
        System.out.println("set name " + name);
    }

    public void show() {
        System.out.println("num is " + num);
        System.out.println("gas is " + gas);
        System.out.println("name is " + name);
    }

}
