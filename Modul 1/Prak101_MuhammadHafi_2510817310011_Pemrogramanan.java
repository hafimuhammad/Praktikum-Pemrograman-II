import java.util.Scanner;
import java.util.List;

class Prak101_MuhammadHafi_2510817310011_Pemrogramanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama_bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        if (bulan < 1 || bulan > 12) {
            System.out.print("Bulan Tidak Valid");
            System.exit(1);
        }
        String bulan_lahir = nama_bulan[bulan - 1];

        int maxHari;
        if (bulan == 2) {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                maxHari = 29;
            } else {
                maxHari = 28;
            }
        } else if (List.of(4, 6, 9, 11).contains(bulan)) {
            maxHari = 30;
        } else {
            maxHari = 31;
        }

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        if (tanggal < 1 || tanggal > maxHari) {
            System.out.print("Tanggal Tidak Valid");
            System.exit(1);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();
        System.out.println("Nama Lengkap " + nama + " Lahir di " + tempatLahir + " pada tanggal " + tanggal + " " + bulan_lahir + " " + tahun + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

        input.close();
    }
}