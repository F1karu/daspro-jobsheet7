import java.util.Scanner;

public class TiketBioskop02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000, noPelanggan = 1 , totalTiket = 0;
        double totalPenjualan = 0;
        String lanjut = "y";

        do {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + noPelanggan + ": ");
            int tiket = input.nextInt();

            if (tiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue;
            }

            double diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
                System.out.println("Pelanggan mendapatkan diskon 15%");
            } else if (tiket > 4) {
                diskon = 0.10;
                System.out.println("Pelanggan mendapatkan diskon 10%");
            }

            double totalHarga = tiket * hargaTiket;
            double potongan = totalHarga * diskon;
            double totalBayar = totalHarga - potongan;

            System.out.println("Total harga: Rp " + (int) totalHarga);
            System.out.println("Diskon: Rp " + (int) potongan);
            System.out.println("Total bayar: Rp " + (int) totalBayar);

            totalTiket += tiket;
            totalPenjualan += totalBayar;
            noPelanggan++;

            System.out.print("Lanjut transaksi? (y/n): ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n=== Rekap Penjualan Harian ===");
        System.out.println("Total tiket terjual: " + totalTiket + " tiket");
        System.out.println("Total penjualan: Rp " + (int) totalPenjualan);

        input.close();
    }
}
