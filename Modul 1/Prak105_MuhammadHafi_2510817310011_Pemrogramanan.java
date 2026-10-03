import java.util.Scanner;

public class Prak105_MuhammadHafi_2510817310011_Pemrogramanan {

    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Jari Jari: ");
        double radius = scanner.nextDouble();
        System.out.println("Masukan tinggi : ");
        double tinggi = scanner.nextDouble();

        double result = phi * radius * radius * tinggi;

        System.out.print("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + tinggi + " cm adalah " + result + " cm3");

        scanner.close();
    }
}

