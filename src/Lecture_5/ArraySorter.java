package Lecture_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySorter {
    public void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String str = array[i];
                        array[i] = array[j];
                        array[j] = str;
                    }
                } else if (isNumber(array[i]) && isNumber(array[j])) {
                        if (Integer.parseInt(array[j]) - Integer.parseInt(array[i])  >0) {
                            String str = array[i];
                            array[i] = array[j];
                            array[j] = str;
                        }
                    }
                }
            }
        }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
