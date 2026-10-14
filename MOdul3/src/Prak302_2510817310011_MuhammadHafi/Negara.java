package Prak302_2510817310011_MuhammadHafi;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tglKemerdekaan;
    private int blnKemerdekaan;
    private int thnKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tglKemerdekaan,
                  int blnKemerdekaan, int thnKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tglKemerdekaan = tglKemerdekaan;
        this.blnKemerdekaan = blnKemerdekaan;
        this.thnKemerdekaan = thnKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tglKemerdekaan = 0;
        this.blnKemerdekaan = 0;
        this.thnKemerdekaan = 0;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    public String getNamaPemimpin() {
        return namaPemimpin;
    }
    public int getTglKemerdekaan() {
        return tglKemerdekaan;
    }
    public int getBlnKemerdekaan() {
        return blnKemerdekaan;
    }
    public int getThnKemerdekaan() {
        return thnKemerdekaan;
    }
}