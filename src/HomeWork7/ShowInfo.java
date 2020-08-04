package HomeWork7;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShowInfo<K, V> {

    private LinkedHashMap<K, V> linkedHashMap;

    public ShowInfo(LinkedHashMap<K, V> linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }

    /**
     * Метод выводит в консоль ключ-значение для LinkedHashMap
     * @param counter количество выводимых пар: ключ-значение
     */
    public void printInfo(int counter){
        System.out.println("Топ 20 слов в книге Война и мир:");

        for (Map.Entry<K, V> map : linkedHashMap.entrySet()){
            counter ++;
            K key = map.getKey();
            V value = map.getValue();
            System.out.println(" " + key + " - " + value + " раз");
            if (counter == 20){
                return;
            }
        }
    }
}
