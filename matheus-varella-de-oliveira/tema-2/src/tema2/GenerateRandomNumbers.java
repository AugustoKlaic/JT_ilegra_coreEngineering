package tema2;

import java.util.Random;


public class GenerateRandomNumbers {
    public static int generateOdd() {

        Random randomGenerator = new Random();
        while (true) {
            int random = randomGenerator.nextInt(100);
            System.out.println(random);
        }
    }
}
