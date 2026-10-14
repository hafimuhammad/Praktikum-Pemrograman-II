package Prak301_2510817310011_MuhammadHafi;

import java.util.LinkedList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah dadu: ");
            int jumlahDadu = scanner.nextInt();

            LinkedList<Dadu> daftarDadu = new LinkedList<>();

            for (int i = 0; i < jumlahDadu; i++) {
                daftarDadu.add(new Dadu());
            }

            int totalNilai = 0;
            int nomor = 1;

            for (Dadu dadu : daftarDadu) {
                int nilaiDadu = dadu.getNilai();
                System.out.println("Dadu ke-" + nomor + " bernilai " + nilaiDadu);
                totalNilai += nilaiDadu;
                nomor++;
            }

        System.out.println("Total nilai semua dadu: " + totalNilai);
        scanner.close();
    }
}

