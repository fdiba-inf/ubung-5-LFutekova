package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in ascending order
        for (int i = 1; i < numbers.length; i++) {

            int elementIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if(numbers[elementIndex] < numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[elementIndex];
                    numbers[elementIndex] = temp;
                    elementIndex = j;
                }
            }
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
