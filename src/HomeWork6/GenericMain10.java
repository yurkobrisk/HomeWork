package HomeWork6;

public class GenericMain10 {
    public static void main(String[] args) {
        DataContainer<String> data = new DataContainer<>(new String[1]);

        for (String item : data.getItems()) {
            System.out.println(item);
        }
        System.out.println("--------------");

        int index0 = data.add("Asdasd");
        int index1 = data.add("asdas");
        int index2 = data.add("j6573123sd");
        int index3 = data.add("1253");
        int index4 = data.add("hjs653");

        for (String item : data.getItems()) {
            System.out.println(item);
        }

        System.out.println("--------------");
        System.out.println("Содержимое ячейки: " + index0 + " - " + data.get(0));
        System.out.println("Содержимое ячейки: " + index1 + " - " + data.get(1));
        System.out.println("Содержимое ячейки: " + index4 + " - " + data.get(4));

        System.out.println("Удаление элемента с индексом: " + index2 + " " + data.delete(2));
        System.out.println("Удаление элемента с индексом: 8 " + data.delete(8));

        for (String item : data.getItems()) {
            System.out.println(item);
        }
        System.out.println("--------------");

        System.out.println("Удаление элемента с содержимым: " + data.get(1) + " " + data.delete(data.get(1)));
        System.out.println("Удаление элемента с содержимым: " + "hasf677hfh" + " " + data.delete("hasf677hfh"));

        for (String item : data.getItems()) {
            System.out.println(item);
        }
    }
}
