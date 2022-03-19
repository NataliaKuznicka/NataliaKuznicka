package nataliapio;

import java.util.Random;

public class NataliaPiO {

    public static void main(String[] args) {
//        System.out.println("Witaj w grze, podaj liczbę od 1 do 6");
//        Random random = new Random();
//        int randomNumber = random.nextInt(6);
//        System.out.println("Wylosowana liczba to: " + randomNumber);
//        int guessingNumber = random.nextInt(6);
//        System.out.println("Zgadywana liczba to: " + randomNumber);
//        if (randomNumber != guessingNumber) {
//            System.out.println("Liczba jest nieprawidłowa, podaj ponownie liczbę");
//        }
//        else return;
// klasa jest opisem typu
        Random dice = new Random();

        Player player = new Player();

        int number;
        int guess;

        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

//            guess = dice.nextInt(6) + 1;
            guess = player.guess();
            System.out.println("Gracz: " + guess);

            if (guess == number) {
                System.out.println("BRAWO!");
            }
            else {  
                System.out.println("ŹLE");
            }
        } while (guess != number);
    
    }
}
