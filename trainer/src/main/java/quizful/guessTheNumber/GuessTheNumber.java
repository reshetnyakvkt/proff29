package quizful.guessTheNumber;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Reshetnyak Viktor on 01.01.2016.
 * Project prof29
 * Package quizful.guessTheNumber
 *
 * Угадай число
 * Попросите кота загадать число от 0 до 100.
 * У вас будет семь попыток на угадывание.
 * При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
 * Если угадаете, уложившись в семь попыток, то выиграли.
 * Если нет, то идёте кормить кота.
 */
public class GuessTheNumber {
    public static void main(String[] args){
        boolean b6 = Boolean.FALSE;

        Cat cat = new Cat();
        Guess guess = new Guess();
        int attempts = 0;
        while (++attempts <= 7 && ! guess.nextAttempts(cat)){

        }
        System.out.println("Number of attempts " + attempts);
    }
}

class Guess{
    private int minNumber = 0;
    private int maxNumber = 100;

    public Guess() {
    }

    public boolean nextAttempts(Cat cat){
        int nextNumber = Math.round((float)(minNumber + maxNumber) / 2F);
        boolean res = false;
        System.out.println(nextNumber + " from " + minNumber + " to " + maxNumber + "(" + cat.getNumber() + ")");
        switch(cat.checkNumber(nextNumber)){
            case -1:
                minNumber = nextNumber;
                break;
            case 1:
                maxNumber = nextNumber;
                break;
            case 0:
                maxNumber = nextNumber;
                minNumber = nextNumber;
                res = true;
                break;
        }
        return res;
    }
}

class Cat{
    private int number;
    public Cat() {
        Random random = new Random();
        // Генерируем число от 0 до 100
        number = random.nextInt(100) + 1;
    }

    public int getNumber() {
        return number;
    }

    public int checkNumber(int number){
        if (number > this.number){
            return 1;
        } else if (number < this.number){
            return -1;
        }
        return 0;
    }
}
