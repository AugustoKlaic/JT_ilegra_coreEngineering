package tema2;

public class PrinterOdd implements Runnable {

    private final long LONG_SLEEP = 500;

    public void run() {
        try {
            while (true) {
                GenerateRandomNumbers generator = new GenerateRandomNumbers();
                generator.generateOddNumber();
                Thread.sleep(LONG_SLEEP);
            }
        } catch (Exception e) {
        }
    }
}
