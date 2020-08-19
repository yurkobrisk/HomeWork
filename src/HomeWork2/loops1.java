package HomeWork2;

public class Loops1 {
    public static void main(String[] args) {
        tableMultiplication();
    }
    static void tableMultiplication(){

        for (int i = 1; i < 11; i++) {
            columnMultiplication(2,5, i);
        }
        System.out.println();
        for (int i = 1; i < 11; i++) {
            columnMultiplication(6, 9, i);
        }
    }
    static void columnMultiplication (int multi1, int multi2, int factor){
        for (int j = multi1; j <= multi2; j++) {
            if (j <= multi2){
                System.out.printf( "%3d x %-2d = %2d  ", j, factor, factor * j );
            }
        }
        System.out.println();
    }
}
