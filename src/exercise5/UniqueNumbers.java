package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        // Find unique numbers in numbers

        int uniqueIndex = 0;

        for (int number : numbers) {
            boolean unique = true;
            /*for (int j = numbers.length - 1; j > i ; j--) {
                if(numbers[i] == numbers [j]){
                    unique = false;
                    break;
                }
            }*/
            for (int j = 0; j <= uniqueIndex; j++) {
                if (number == uniqueNumbers[j] && number != 0) {
                    unique = false;
                    break;
                } else if (number == 0) {
                    for (int k = 0; k < j; k++) {
                        if (uniqueNumbers[k] == 0) {
                            unique = false;
                            break;
                        }
                    }
                }
            }
            if (unique) {
                uniqueNumbers[uniqueIndex] = number;
                uniqueIndex++;
            }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
