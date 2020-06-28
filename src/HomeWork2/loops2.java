package HomeWork2;

public class loops2 {
    /**
     * Multiplication (example in 5 out 1*2*3*4*5=120)
     * @param number Number multipliers
     */
    static void multiplication(int number){
        if (number == 0) {
            System.out.println("Not correct number. Try again ;)");
        }
        else {
            int result = 1;
            for (int i = 1; i <= Math.abs(number); i++) {
                System.out.print(i);
                if (i < Math.abs(number)) {
                    System.out.print(" * ");
                }
                result = result * i;
            }
            System.out.println(" = " + result);
        }
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        multiplication(number);
    }
}


