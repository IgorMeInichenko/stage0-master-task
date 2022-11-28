package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (checkSides(firstSide, secondSide, thirdSide)){
            System.out.println("this is a valid triangle");
        }
        else {
            System.out.println("it's not a triangle");
        }
    }
    boolean checkSides(double x1, double x2, double x3){
        return (x1+x2 > x3)&&(x3+x2 > x1)&&(x1+x3 > x2);
    }
}
