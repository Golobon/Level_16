package Lecture_5;

public class Solution_2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (Exception e){
                e.printStackTrace();
            }

            //напишите тут ваш код
        }
    }
}
