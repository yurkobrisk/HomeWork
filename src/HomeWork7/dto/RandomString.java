package HomeWork7.dto;

import java.util.Random;

public class RandomString {

    /**
     * Метод Генерирует строку с указанным максимальным количеством символов.
     * Латиница decimal 65-90 {A-Z}, 97-122 {a-z}
     * Кирилица decimal 1040-1071 {А-Я}, 1072-1103 {а-я}
     * decimal 32 {' '}
     * @param stringLength Количество символов которые должно быть в строке
     * @return Строка символов. Буквы в строке: Латиница, Кирилица, Пробел.
     */
    public static String random(int stringLength){
        char[] charsArray = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
                                        'U','V','W','X','Y','Z',
                                        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                                        'u','v','w','x','y','z',' ',
                                        'А','Б','В','Г','Д','Е','Ж','З','И','К','Л','М','Н','О','П','Р','С','Т','У','Ф',
                                        'Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я',
                                        'а','б','в','г','д','е','ж','з','и','к','л','м','н','о','п','р','с','т','у','ф',
                                        'х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++) { // цикл с длиной введенной в параметре метода
            int temp = randomInt(0, charsArray.length - 1); // генерировать случайное число в диапазоне от 0 до charsArray.length - 1
            sb.append(charsArray[temp]);
        }
        return sb.toString();
    }

    /**
     * Метод генерирует псевдослучайное число в указанном диапазоне
     * @param min число
     * @param max число
     * @return псевдослучайное число
     */
    public static int randomInt(int min, int max){
        Random random = new Random();
        int result = random.nextInt((max+1-min)); // максимальное значение нужно увеличивать на 1, иначе не попадает в диапазон
        return result += min;
    }
}
