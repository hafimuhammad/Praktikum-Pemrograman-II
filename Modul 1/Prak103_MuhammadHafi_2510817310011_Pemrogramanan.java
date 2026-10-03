import java.util.Scanner;

class Prak103_MuhammadHafi_2510817310011_Pemrogramanan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int angkapertama = scanner.nextInt();
        int count = 0;
        int current = angkapertama;

        do {
            if ( current % 2 != 0){
                System.out.print(current);
                count++;
         if ( count < N){
             System.out.print(", ");
         }
    }
    current++;
} while (count < N);

    scanner.close();
    }
}