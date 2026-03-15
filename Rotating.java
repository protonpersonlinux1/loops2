import java.util.Scanner;

class Rotating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int lastDigit = n % 10;
        int remaining = n / 10;

        int digits = (int) Math.log10(remaining) + 1;

        int rotatedNumber = lastDigit * (int)Math.pow(10, digits) + remaining;

        System.out.println("Rotated Number: " + rotatedNumber);
    }
}