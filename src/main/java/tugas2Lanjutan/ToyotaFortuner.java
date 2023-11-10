package Tugas2Lanjutan;

public class ToyotaFortuner extends Car {
    public ToyotaFortuner() {
        super(80, "Manual");
    }

    @Override
    public void moveForward() {
        System.out.println("Toyota Fortuner maju dengan kekuatan penuh.");
    }

    public void activate4WD() {
        System.out.println("4WD Toyota Fortuner diaktifkan.");
    }
}
