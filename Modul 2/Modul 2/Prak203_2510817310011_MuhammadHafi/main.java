package Prak203_2510817310011_MuhammadHafi;

public class main {
    public static void main(String[] args){
        pegawai p1 = new pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdomm of Orvel";
        p1.setJabatan("Assasin");
        p1.umur = 17;

        System.out.println("Nama pegawai: " + p1.getnama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}

