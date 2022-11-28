package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String result = "This animal is mostly "+this.color+". It has ";
        if (this.numberOfPaws>1){
            result += this.numberOfPaws;
            result +=" paws and";
        }
        else {
            result += "1 paw and";
        }
        if (this.hasFur){
            result += " a fur.";
        }
        else {
            result += " no fur.";
        }
        return result;
    }
}
