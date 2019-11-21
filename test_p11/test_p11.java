package test_p11;

public class test_p11 {
    public static void main(String args[]) {
        RacingCar rccar1 = new RacingCar();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);

        rccar1.show();
    }
}

class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("生產了賽車");
    }

    public RacingCar(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("生產了編號為" + course + "的賽車");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }

    public void show() {
        System.out.println(String.format("賽車的車號是" + num + "\n汽油量是" + gas + "\n賽車編號是" + course));
    }
}