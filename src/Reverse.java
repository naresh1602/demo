public class Reverse {
    public static void main(String[] args) {

        int reverseNumber = 12345;
        int reversedNumber = 0;

        int number = reverseNumber;
        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}
