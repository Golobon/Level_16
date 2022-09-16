package Lecture_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_4 {
    /*public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Character> listGlas = new ArrayList<>();
        List<Character> listSoglas = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {
                listGlas.add(str.charAt(i));;
            }

            else {

                if (!(str.charAt(i) == ' ')) {
                    listSoglas.add(str.charAt(i));
                }
            }
        }
        for (Character ch : listGlas) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (Character ch : listSoglas) {
                System.out.print(ch + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }*/
}
