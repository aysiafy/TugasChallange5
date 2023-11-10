package Tugas2Lanjutan;

public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        jazz.playMusic();
        fortuner.activate4WD();
        katana.activateTurbo();
    }
}
