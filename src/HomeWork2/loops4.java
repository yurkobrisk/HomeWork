package HomeWork2;

import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        float number = scanner.nextFloat();
        float degree = -1;
        while (degree < 0 || degree%1 != 0) {
            System.out.println("Введите степень числа: ");
            degree = scanner.nextFloat();
            if (degree < 0 || degree%1 != 0) {
                System.out.println("Такая степень числа не поддерживается в этой программе");
            }
        }
        System.out.println(number + " в степени " + degree + " = " + numberDegree(number, degree));
    }
    static double numberDegree (float number, float degree){
        double result = 1;
        if (degree%1 == 0) {
            for (int i = 1; i <= degree; i++) {
                result = result * number;
            }
        }
        return result;
    }
}
