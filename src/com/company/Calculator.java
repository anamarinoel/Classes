package com.company;


public class Calculator {

    public static void main(String [] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditonResult());
        System.out.println("substract " + calculator.getSubstractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multilpy = " + calculator.getMultiplicationResult());
        System.out.println("division " + calculator.getDivisionResult());

    }




}
