package HomeWork6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {
    private T[] data, dataCopy;

    public DataContainer(T[] initArr){
        this.data = initArr;
    }

    /**
     * Метод добавляет элемент в массив расширяя его при отсутствии свободного места в нем
     * @param item элемент массива котороый необходимо добавить
     * @return номер ячейки в которую добавлен элемент
     */
    public int add(T item){
        for (int i = 0; ; i++) {
            if (i == data.length){
                dataCopy = (T[]) Array.newInstance(data.getClass().getComponentType(), data.length + 1);
                System.arraycopy(data, 0, dataCopy, 0, data.length);
                data = dataCopy;
                data[i] = item;
                return i;
            } else if (data[i] == null){
                data[i] = item;
                return i;
            }
        }
    }

    public T get(int index){
        return this.data[index];
    }

    public T[] getItems(){
        return data;
    }

    /**
     * Метод удаляет элемент массива в указанной ячейке и возвращает true если операция выполнена успешно, иначе false
     * @param index индекс ячейки значение из которой необходимо удалить
     * @return результат выполения оперрации true если ячейка удалена, false если ячейка не найдена или меньше 0
     */
    public boolean delete(int index){
        if (index < 0){
            System.out.println("Индекс меньше ноля");
            return false;
        } else if (index > data.length-1){
            System.out.println("Индекс больше длины массива");
            return false;
        } else {
            data[index] = null;
            for (int i = 0; i < data.length+1; i++) {
                if (data[i] == null){
                    if (i == data.length-1){
                        data = Arrays.copyOf(data, data.length - 1);
                        return true;
                    } else {
                        data[i] = data[i+1];
                        data[i+1] = null;
                    }
                }
            }
        }
        return true;
    }

    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)){
                delete(i);
                return true;
            }
        }
        return false;
    }
}
