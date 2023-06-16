import Numorous1.NumberRunnable;

public class Numerous {
    public static void main(String[] args) {
        NumberRunnable numberRunnable = new NumberRunnable();
        Thread thread = new Thread(NumberRunnable);
        thread.start();
    }
}
