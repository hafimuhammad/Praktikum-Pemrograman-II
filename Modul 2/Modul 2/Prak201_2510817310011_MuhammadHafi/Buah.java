package Prak201_2510817310011_MuhammadHafi;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah_beli;
    private double total;
    private double diskon;

    public Buah(String nama, double berat, double harga, double jumlah_beli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
    }

    public double getDiskon() {
        double total = 0;
        double diskon = 0;
        for (int i = 0; i < jumlah_beli / 4; i++) {
            total += harga * (4 / berat);
            diskon += total * 0.02;
        }
        return diskon;
    }

    public void info() {
        this.total = (this.jumlah_beli / this.berat) * this.harga;
        this.diskon = getDiskon();

        System.out.printf("Nama Buah: %s\n", this.nama);
        System.out.printf("Berat: %s\n", this.berat);
        System.out.printf("Harga: %.1f\n", this.harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", this.jumlah_beli);
        System.out.printf("Harga Sebelum Diskon: %.2f\n", this.total);
        System.out.printf("Total Diskon: %.2f\n", this.diskon);
        System.out.printf("Harga Setelah Diskon: %.2f\n\n", (this.total - this.diskon));
    }
}