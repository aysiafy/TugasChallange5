package Tugas2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount account = new BankAccount("12345", 1000, "John Doe", "john@example.com", "123-456-7890");

        // Melakukan deposit dan withdraw
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); // Ini akan menampilkan pesan error karena saldo tidak mencukupi
    }

}
