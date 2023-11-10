package Tugas1;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        // Contoh penggunaan fungsi dengan 26 jam
        double fee1 = calculateParkingFee(26);
        System.out.println("Biaya parkir untuk 26 jam adalah: $" + fee1);

        // Contoh penggunaan fungsi dengan 8 jam
        double fee2 = calculateParkingFee(8);
        System.out.println("Biaya parkir untuk 8 jam adalah: $" + fee2);
    }

    public static double calculateParkingFee(int hours) {
        double fee;
        if (hours <= 5) {
            fee = 1.0; // 5 jam pertama $1
        } else if (hours < 24) {
            fee = 1.0 + (hours - 5) * 0.5; // Setelah itu $0.5 per jam
        } else {
            fee = 15.0; // Flat rate untuk 24 jam
            hours -= 24;
            fee += hours * 0.5; // Tambahkan $0.5 per jam setelah 24 jam
        }
        return fee;
    }
}
