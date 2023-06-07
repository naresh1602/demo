public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;

        System.out.println("Original array:");
        printArray(array);

        rotateLeft(array, positions);

        System.out.println("Array after left rotation:");
        printArray(array);
    }

    public static void rotateLeft(int[] array, int positions) {
        int length = array.length;

        // Reduce the number of positions if it exceeds the array length
        positions %= length;

        // Reverse the elements of the entire array
        reverseArray(array, 0, length - 1);

        // Reverse the elements from the start till the number of positions - 1
        reverseArray(array, 0, positions - 1);

        // Reverse the elements from the number of positions till the end
        reverseArray(array, positions, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
