package tema2;

public class RandomNumbers implements Runnable {
    private int threadID;
    int randomNumber;

    public RandomNumbers(int id) {
        this.threadID = id;
        this.randomNumber = 0;
    }

    public void run() {

        while (true) {
            System.out.println("Thread number " + threadID + " = " + randomNumber);
            try {
                if (threadID == 1) {
                    randomOdd();
                } else if (threadID == 2) {
                    randomEven();
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public void randomOdd() {
        int oddNumber = Integer.valueOf((int) (Math.random() * 100));
        if (oddNumber % 2 != 0) {
            oddNumber += 1;

            randomNumber = oddNumber;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void randomEven() throws InterruptedException {
        int evenNumber = Integer.valueOf((int) (Math.random() * 100));
        if (evenNumber % 2 == 0)
            evenNumber += 1;

        randomNumber = evenNumber;
        Thread.sleep(100);
    }
}
