public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        printFibonacciSeries(N);
    }

    public static void printFibonacciSeries(int N) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);

        for (int i = 2; i < N; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
