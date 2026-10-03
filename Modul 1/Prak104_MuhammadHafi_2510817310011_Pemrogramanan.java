import java.util.Scanner;

public class Prak104_MuhammadHafi_2510817310011_Pemrogramanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tanggan abu: ");
        String tanganabu = scanner.nextLine();
        System.out.print("Tanggan Bagas: ");
        String tangganbagas = scanner.nextLine();

        String[] Abu = tanganabu.split(" ");
        String[] Bagas = tangganbagas.split(" ");

        int pointAbu = 0;
        int pointBagas = 0;

        for (int i = 0; i < 3; i++) {
            char pilihanAbu = Abu[i].charAt(0);
            char pilihanBagas = Bagas[i].charAt(0);

            if (pilihanAbu == pilihanBagas){
                continue;
            }
            if ((pilihanAbu == 'B' && pilihanBagas == 'G') ||
                 (pilihanAbu == 'G' && pilihanBagas == 'K') ||
                 (pilihanAbu == 'K' && pilihanBagas == 'B')) {
                pointAbu++;
            } else {
                pointBagas++;
            }
        }
        if (pointAbu > pointBagas) {
            System.out.println("Abu");}
        else if (pointBagas > pointAbu) {
            System.out.println("Bagas");}
        else {
            System.out.println("imbang");
        }

        scanner.close();
    }
}
