package tema2;

public class PrinterEven implements Runnable {

private final long SHORT_SLEEP = 100;

    public void run() {
        try {
            while (true) {
                GenerateRandomNumbers generator = new GenerateRandomNumbers();
                generator.generateEvenNumber();
                Thread.sleep(SHORT_SLEEP);
            }
        } catch (Exception e) {
        }
    }
}
