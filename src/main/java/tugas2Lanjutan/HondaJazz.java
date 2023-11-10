package Tugas2Lanjutan;

public class HondaJazz extends Car {
    public HondaJazz() {
        super(40, "Automatic");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Honda Jazz pindah ke transmisi " + gear);
    }

    public void playMusic() {
        System.out.println("Memutar musik di Honda Jazz.");
    }
}
