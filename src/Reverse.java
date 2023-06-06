//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Reverse {
    public Reverse() {
    }

    public static void main(String[] args) {
        int reverseNumber = 12345;
        int reversedNumber = 0;

        for(int number = reverseNumber; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println(reversedNumber);
    }
}
