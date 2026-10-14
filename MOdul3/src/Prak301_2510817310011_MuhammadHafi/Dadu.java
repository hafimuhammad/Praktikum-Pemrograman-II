package Prak301_2510817310011_MuhammadHafi;

import java.util.Random;

public class Dadu {
    private int nilai;

        public Dadu() {
            Random random = new Random();
            this.nilai = random.nextInt(6) + 1;
        }

        public int getNilai() {
            return nilai;
        }
}

