package Fundamentals1;

public class lesson154 {

    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i <= 300; i++) {
            if (i % 4 == 0 ^ i % 3 == 0) {

                System.out.println(i);
                a++;
                if (a == 10) {
                    break;
                }
            }
        }
    }
}