package ru.job4j.calculator;
/**
*@author Fomichenkoav
*@since 20.04.2017
*@version 1
*/


public class Calculator {
    private double result;
    /**
	*метод сложения  аргумент first и second
	*/
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
	*метод вычитание  аргумент first и second
	*/
	public void subtract(double first, double second) {
        this.result = first - second;
    }
	/**
	*метод деления  аргумент first и second
	*/
	public void div(double first, double second) {
        this.result = first / second;
    }
	/**
	*метод умножения аргумент first и second
	*/
	public void substruct(double first, double second) {
        this.result = first * second;
    }
	/**
	* Геттер возвращающий значение поля result;
	*/
	 public double getResult() {
        return this.result;
    }
	
	
}
	
	
