package HomeWork3;

import java.util.Scanner;

public class Obj1 {
    public static void main(String[] args) {
        Color color1 = new Color(3);
        System.out.println("Номер цвета: " + color1.getNumber());
        System.out.println("Цвет: " + color1.getName());

        // Ввод с консоли значения цвета
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер цвета: ");
        Color color = new Color(scanner.nextInt());
        System.out.println("Номер цвета: " + color.getNumber());
        System.out.println("Цвет: " + color.getName());*/
    }
}

class Color {

    public Color (int colorNumber){
        this.colorNumber = colorNumber;
    }

    private int colorNumber;

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;

    public int getNumber(){
        return colorNumber;
    }

    public String getName(){
        String name;
        switch (colorNumber){
            case RED : name = "Красный";
            break;
            case ORANGE : name = "Оранжевый";
            break;
            case YELLOW : name = "Желтый";
            break;
            case GREEN : name = "Зеленый";
            break;
            case BLUE : name = "Голубой";
            break;
            case INDIGO : name = "Синий";
            break;
            case VIOLET : name = "Фиолетовый";
            break;
            default: name = "неизвестно";
        }
        return name;
    }
}
