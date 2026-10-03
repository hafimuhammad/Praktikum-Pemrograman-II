package Prak202_251081731011_MuhammadHafi;

public class Kopi {
    public String namakopi;
    public String ukuran;
    public Double harga;
    private String pembeli;

    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli(){
        return  this.pembeli;
    }

    public String getpajak(){
        return String.format("%.1f", harga * 0.11);
    }

    public void info() {
        System.out.printf("Nama Kopi: %s\n" +
                        "Ukuran: %s\n" +
                        "Harga: Rp %.1f\n",
                this.namakopi, this.ukuran, this.harga);
    }
}
