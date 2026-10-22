import java.util.Scanner;

public class SiakadFor02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nilai, batasLulus, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        System.out.println("Masukkan nilai batas kelulusan: ");
        batasLulus = input.nextDouble();
        

        for  (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan Nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= batasLulus) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);

        System.out.println("Jumlah mahasiswa yang lulus: " +jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " +jumlahTidakLulus);

        input.close();
    }
}