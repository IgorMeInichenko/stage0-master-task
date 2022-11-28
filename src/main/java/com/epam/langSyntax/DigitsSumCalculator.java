package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        char[] arrayOfNumbers = Integer.toString(number).toCharArray();
        int result = 0;
        for (char x: arrayOfNumbers){
            result += (x - '0');
        }
        System.out.println(result);
    }

}
