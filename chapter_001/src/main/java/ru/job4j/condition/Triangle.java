package ru.job4j.condition;
/**
 * @author Fomichenkoav.
 * @version 1
 * @since 02.05.2017
 */
public class Triangle {
  private Point a;
  private Point b;
  private Point c;
 
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
 
  public static double area(double a, double b, double c) {
	double p = (a + b + c) / 2;
	return  Math.sqrt(p * (a - p) * (p - b) * (p - c));
  }
}