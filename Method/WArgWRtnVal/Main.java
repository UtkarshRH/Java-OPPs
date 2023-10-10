public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int shiftedNumber = shiftFirstDigitToLast(number);
        System.out.println("Original number: " + number);
        System.out.println("Number after shifting first digit to last: " + shiftedNumber);
    }

    public static int shiftFirstDigitToLast(int number) {
        int temp = number; // Store the original number in a temporary variable
        int numberOfDigits = 1;
        
        // Count the number of digits in the input number
        while (temp >= 10) {
            temp = temp / 10;
            numberOfDigits *= 10;
        }

        // Extract the first digit
        int firstDigit = number / numberOfDigits;

        // Remove the first digit and shift the rest of the number to the left
        int shiftedNumber = (number % numberOfDigits) * 10 + firstDigit;

        return shiftedNumber;
    }
}
