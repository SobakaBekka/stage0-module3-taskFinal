package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int thousends = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int once = number % 10;
        int summaDigits = thousends + hundreds + tens + once;
        System.out.println(summaDigits);

    }
}
