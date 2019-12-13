package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditonResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubstractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {

        if(secondNumber > 0) {
            return this.firstNumber / this.secondNumber;
        } else {
            return 0;
        }
    }

}
