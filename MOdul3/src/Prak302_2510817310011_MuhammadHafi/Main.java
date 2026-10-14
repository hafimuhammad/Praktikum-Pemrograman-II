package Prak302_2510817310011_MuhammadHafi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Negara> listNegara = new LinkedList<>();

        HashMap<Integer, String> mapBulan = new HashMap<>();
        mapBulan.put(1, "Januari");
        mapBulan.put(2, "Februari");
        mapBulan.put(3, "Maret");
        mapBulan.put(4, "April");
        mapBulan.put(5, "Mei");
        mapBulan.put(6, "Juni");
        mapBulan.put(7, "Juli");
        mapBulan.put(8, "Agustus");
        mapBulan.put(9, "September");
        mapBulan.put(10, "Oktober");
        mapBulan.put(11, "November");
        mapBulan.put(12, "Desember");

        int n = Integer.parseInt(input.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String nama = input.nextLine();
            String jenis = input.nextLine();
            String pemimpin = input.nextLine();

            if (jenis.equalsIgnoreCase("monarki")) {
                listNegara.add(new Negara(nama, jenis, pemimpin));
            } else {
                int tgl = Integer.parseInt(input.nextLine().trim());
                int bln = Integer.parseInt(input.nextLine().trim());
                int thn = Integer.parseInt(input.nextLine().trim());

                listNegara.add(new Negara(nama, jenis, pemimpin, tgl, bln, thn));
            }
        }

        System.out.println();
        for (Negara negara : listNegara) {
            System.out.print("Negara " + negara.getNama() + " mempunyai " + negara.getJenisKepemimpinan() + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                String namaBulan = mapBulan.get(negara.getBlnKemerdekaan());
                System.out.print(" Deklarasi Kemerdekaan pada Tanggal " + negara.getTglKemerdekaan() + " " + namaBulan + " " + negara.getThnKemerdekaan());
            }
            System.out.println();
        }
        input.close();
    }
}