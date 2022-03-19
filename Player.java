package nataliapio;

import java.util.Random;

class Player {
    Random brain = new Random();

    public int guess() {
        return brain.nextInt(6) + 1;
    }
}
