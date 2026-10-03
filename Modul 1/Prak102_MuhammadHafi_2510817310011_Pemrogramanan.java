import java.util.Scanner;

class Prak102_MuhammadHafi_2510817310011_Pemrogramanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int i = 0;

        while (i < 10) {
            int nilai;
            if (x % 5 == 0) {
                nilai = (x / 5) - 1;
            } else {
                nilai = x;
            }

            System.out.print(nilai);
            if (i < 9) {
                System.out.print(",");
            }

            x++;
            i++;
        }

        scanner.close();
    }
}