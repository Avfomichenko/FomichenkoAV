package main.java.ru.job4j.max;

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
      int max = first < second ? second : first;
      return max;

    }


}