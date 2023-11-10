package Tugas2Lanjutan;

public class SuzukiKatana extends Car {
    public SuzukiKatana() {
        super(50, "Manual");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Suzuki Katana berbelok dengan lincah ke " + direction);
    }

    public void activateTurbo() {
        System.out.println("Turbo Suzuki Katana diaktifkan.");
    }
}
