import java.util.Scanner;

public class TempatParkir02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {System.out.println("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
        jenis = input.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.println("Masukkan jumlah durasi");
            durasi = input.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
                System.out.println("Total: " + total);
            } else {
                total += durasi * 2000;
                System.out.println("Total: " + total);
            }
        } 
    }
        while (jenis != 0);
        input.close();
    

    } 
}