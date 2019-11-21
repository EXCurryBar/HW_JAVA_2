package test_p32;

public class test_p32 {
    public static void main(String args[]) {
        Vehicle[] v = new Vehicle[2];
        v[0] = new Car(1234, 20.5);
        v[1] = new Plane(232);
        for (int i = 0; i < v.length; i++)
            System.out.println("第" + (i + 1) + (v[i] instanceof Car ? "這個物件是Car類別" : "這個物件不是Car類別"));
    }
}

abstract class Vehicle {
    protected int speed;

    public void setspeed(int s) {
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }

    abstract void show();
}

class Car extends Vehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num + "\n汽油量是" + gas + "\n速度是" + speed);
    }
}

class Plane extends Vehicle {
    private int flight;

    public Plane(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight + "\n速度是" + speed);
    }
}