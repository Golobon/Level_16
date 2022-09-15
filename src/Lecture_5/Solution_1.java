package Lecture_5;

public class Solution_1 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int x = 1 / 0;
        System.out.println(x);
    }
}
