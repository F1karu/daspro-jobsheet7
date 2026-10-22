import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHarga, teh, kopi, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar) ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Tranksaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi = input.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = input.nextInt();
            System.out.println("Jumlah Roti: ");
            roti = input.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            input.nextLine();
        } while (true);

        input.close();
    } 
    
}