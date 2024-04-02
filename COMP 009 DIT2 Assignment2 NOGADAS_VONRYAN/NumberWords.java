package COMP009;

public class NumberWords {

    private static String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen"};

    private static String[] tens = {"", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWord(int number) {
        if (number < 0) {
            return "Number out of range";
        }

        if (number == 0) {
            return "Zero";
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWord(number % 100);
        }

        if (number < 1000000) {
            return convertToWord(number / 1000) + " Thousand " + convertToWord(number % 1000);
        }

        if (number < 1000000000) {
            return convertToWord(number / 1000000) + " Million " + convertToWord(number % 1000000);
        }

        return "Number out of range";
    }
}
