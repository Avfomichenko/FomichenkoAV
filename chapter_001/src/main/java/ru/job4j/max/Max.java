package ru.job4j.max;

/**
 *@author Fomichenkoav.
 *@since 23.04.2017
 *@version 1
 */

public class Max {
    /**
     * Тернарное условие, вычесление максимального значения.
     *@return max
	 *@param first  число
	 *@param second число
  */
    public int max(int first, int second) {

        return first < second ? second : first;
		}
}