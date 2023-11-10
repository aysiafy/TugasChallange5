package Tugas2Lanjutan;

public class Vehicle {
    protected int wheels;
    protected int speed;

    public void moveForward() {
        System.out.println("Vehicle bergerak maju.");
    }

    public void turn(String direction) {
        System.out.println("Vehicle berbelok ke " + direction);

    }
}
