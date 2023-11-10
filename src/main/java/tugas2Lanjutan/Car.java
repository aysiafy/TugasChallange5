package Tugas2Lanjutan;

public class Car extends Vehicle {
    protected int numberOfWheels = 4;
    protected double tankCapacity;
    protected String transmission;

    public Car(double tankCapacity, String transmission) {
        this.wheels = this.numberOfWheels; // Misal, mobil memiliki 4 roda
        this.tankCapacity = tankCapacity;
        this.transmission = transmission;
    }

    public void changeGear(int gear) {
        System.out.println("Mobil pindah ke transmisi " + gear);
    }

    @Override
    public void moveForward() {
        System.out.println("Mobil bergerak maju.");
    }
}
