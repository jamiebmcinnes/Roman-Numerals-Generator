import java.util.Scanner;

public class GenerateRoman {

    public static void main(String[] args) {

        int number;

        //Prompt the user to enter a number within the specified range.
        System.out.println("Please enter a number between 1 and 3999");

        //Read the user input.
        Scanner scanner = new Scanner(System.in);

        //Set the input to the number variable.
        number = scanner.nextInt();

        //Generate the roman numeral for the user's inputted number.
        System.out.println("The roman numeral for " + number + " is:");
        generate(number);
    }


    //Array of unique roman numerals
    private static final String[] numerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    //Array of numbers corresponding to the unique roman numerals
    private static final int[] numbers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


    private static void generate(int number) {

        //If the number is outside the range, print an error message.
        if (number < 1 || number > 3999) {
            System.out.println("Number not between 1 and 3999! Please try again");
        }

        //Create empty variable to contain the roman numeral
        StringBuilder numeral = new StringBuilder();


        //Find highest value of roman numeral that you can subtract from the inputted number and append. Repeat until number = 0.
        int i = 0;
        while (number > 0) {
            if (number - numbers[i] >= 0) {
                numeral.append(numerals[i]);
                number -= numbers[i];
            } else {
                i++;
            }
        }

        //Print result.
        System.out.println(numeral);

    }
}


