package HomeWork1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork1_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\korziuk\\Desktop\\cuple.jpg"); //создание объекта из существующего файла
        BufferedImage image = ImageIO.read(file); // создание графического объекта из объекта файл

        image = imageToGray(image);

        System.out.println(image.getRGB(100,100));

        FileWriter fileAscii = new FileWriter("C:\\Users\\korziuk\\Desktop\\cuple_ascii.txt");
    //        fileNewAscii.write(txt.toString());
        StringBuilder txt = new StringBuilder();
     //   txt = txt.append(grey);
     //   txt = txt.append("---\r\n");  // конец строки

            image.getScaledInstance(100,70, 16);

            // сделать ресайз картинки
            //BufferedImage imageAscii = image;  // создал еще один объект картинки

            // формировать текстовый файл сопоставляя определенному значению RGB - символ

            /*String [][] txtArray = new String [image.getWidth()][image.getHeight()];
            int colorRGB = 0; // цвет пикселя
            for (int row = 0; row < image.getWidth(); row++) {   // чтение картинки по горизонтали
                for (int column = 0; column < image.getHeight(); column++) { // чтение картинки по вертикали
                    int rgb = image.getRGB(row, column);
                    txtArray [row] [column] = Integer.toString(rgb) + " ";  // чтение цвета пикселя
                }
            }*/

            // запись в файл серой картинки
            File fileNew = new File("C:\\Users\\korziuk\\Desktop\\cuple_new.jpg"); // создание нового объекта файл
            ImageIO.write( image ,"jpg", fileNew); // запись объекта графическая картинка в объект файл

    }

    /**
     * Преобразование изображения в grey color
     * @param imageIn Объект цветное изображение
     * @return Объект серое изображение
     */
    static BufferedImage imageToGray (BufferedImage imageIn)  {
        for (int row = 0; row < imageIn.getWidth(); row++){   // чтение картинки по горизонтали
            for (int column = 0; column < imageIn.getHeight(); column++){ // чтение картинки по вертикали
                Color clr = new Color(imageIn.getRGB(row, column));   // создание объекта цвет для пикселя из картинки
                int r = clr.getRed();   // чтение цвета ...
                int b = clr.getBlue();
                int g = clr.getGreen();
                int grey = (int) (r*0.299 + g*0.587 + b*0.114); // алгоритм создания серого цвета на основе RGB
                int newR = grey; // запись в RGB серого цвета
                int newG = grey;
                int newB = grey;
                Color newClr = new Color(newR, newG, newB);  // создание нового объекта цвет для пикселя из картинки
                imageIn.setRGB(row,column, newClr.getRGB());   // запись нового цвета пикселя в картинку
            }
        }
        System.out.println("Изображение преобразовано в Gray");
        return imageIn;
    }
}


