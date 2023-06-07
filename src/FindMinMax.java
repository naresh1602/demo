public class FindMinMax {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 16, 1, 10};
        findMinMax(numbers);
    }

    public static void findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
