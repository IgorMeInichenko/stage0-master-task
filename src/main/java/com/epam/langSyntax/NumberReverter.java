package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int firstChar = number/100;
        int secondChar = (number/10)%10;
        int tripleChar = (number%100)%10;
        System.out.println(tripleChar+""+secondChar+""+firstChar);
    }

}
