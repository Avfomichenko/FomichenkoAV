package ru.job4j.condition;
/**
 * @author Fomichenkoav.
 * @version 1
 * @since 02.05.2017
 */
public class Point {
    /** переменные класса x.*/
    private int x;
    /** переменные класса y.*/
    private int y;
    /***конструктор.*/

    public Point(int x, int y) {
        this.x = x;
        this.x = x;
        this.y = y;
    }
    /**
     *√еттер x.
     *@return y
     */
    public int getX() {
        return this.x;
    }
    /**
     *√еттер y.
     *@return y
     */
    public int getY() {
        return this.y;
    }
    /**
     *ћетод определ¤ющий находитс¤ ли точка на этой фукнции.
     *@return y
     *@param  a - координаты точки
     *@param  b - координаты точки
     */
    public boolean is(int a, int b) {
        return y == a * x + b;
    }
}
