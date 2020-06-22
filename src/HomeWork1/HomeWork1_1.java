package HomeWork1;

public class HomeWork1_1 {
    public static void main(String[] args) {
        int c = 0;  // разрядность 32 бита
        // операции с числами 42 и 15
        System.out.println((c = ~42)       + " " + Integer.toBinaryString(c)); // код числа 42 - ‭0010_1010 result = 111111111111111111111111_1101_0101
        System.out.println((c = ~15)       + " " + Integer.toBinaryString(c)); // код числа 15 - 0000_1111 result = 1111111111111111111111111111_0000
        System.out.println((c = 42 & 15)   + " " + Integer.toBinaryString(c));                          // result = 0000_1010  decimal 10
        c = 42;
        System.out.println((c &= 15)       + " " + Integer.toBinaryString(c));                          // result = 0000_1010
        System.out.println((c = 42 | 15)   + " " + Integer.toBinaryString(c));                          // result = 0010_1111  decimal 47
        c = 42;
        System.out.println((c |= 15)       + " " + Integer.toBinaryString(c));                          // result = 0010_1111
        System.out.println((c = 42 ^ 15)   + " " + Integer.toBinaryString(c));                          // result = 0010_0101‬  decimal 37 (XOR)
        c = 42;
        System.out.println((c ^= 15)       + " " + Integer.toBinaryString(c));                          // result = 0010_0101
        System.out.println((c = 42 >> 15)  + " " + Integer.toBinaryString(c));                          // result = 0‬
        c = 42;
        System.out.println((c >>= 15)      + " " + Integer.toBinaryString(c));                          // result = 0
        System.out.println((c = 42 >>> 15) + " " + Integer.toBinaryString(c));                          // result = 0
        c = 42;
        System.out.println((c >>>= 15)     + " " + Integer.toBinaryString(c));                          // result = 0
        System.out.println((c = 42 << 15)  + " " + Integer.toBinaryString(c));                          // result = 101010000000000000000‬  decimal 1376256
        c = 42;
        System.out.println((c <<= 15)      + " " + Integer.toBinaryString(c));                          // result = 101010000000000000000

        // операции с числами -42 и -15
        System.out.println((c = ~-42)       + " " + Integer.toBinaryString(c)); // код числа (-42) - 1111111111111111111111111_1101_0110  result = 0010_1001
        System.out.println((c = ~-15)       + " " + Integer.toBinaryString(c)); // код числа (-15) -   1111111111111111111111111111_0001    result = 1110
        System.out.println((c = -42 & -15)  + " " + Integer.toBinaryString(c));       // result = 1111111111111111111111111_1101_0000  decimal -48
        c = -42;
        System.out.println((c &= -15)       + " " + Integer.toBinaryString(c));       // result = 1111111111111111111111111_1101_0000  decimal -48
        System.out.println((c = -42 | -15)  + " " + Integer.toBinaryString(c));       // result = 1111111111111111111111111111_0111  decimal -9
        c = -42;
        System.out.println((c |= -15)       + " " + Integer.toBinaryString(c));       // result = 1111111111111111111111111111_0111
        System.out.println((c = -42 ^ -15)  + " " + Integer.toBinaryString(c));       // result = 100111‬  decimal 39 (XOR)
        c = -42;
        System.out.println((c ^= -15)       + " " + Integer.toBinaryString(c));       // result = 100111
        System.out.println((c = -42 >> -15) + " " + Integer.toBinaryString(c));       // result = 11111111111111111111111111111111‬  decimal -1
        c = -42;
        System.out.println((c >>= -15)      + " " + Integer.toBinaryString(c));       // result = 11111111111111111111111111111111
        System.out.println((c = -42 >>> -15)+ " " + Integer.toBinaryString(c));       // result = 111111111111111 decimal 32767
        c = -42;
        System.out.println((c >>>= -15)     + " " + Integer.toBinaryString(c));       // result = 111111111111111
        System.out.println((c = -42 << -15) + " " + Integer.toBinaryString(c));       // result = 11111111101011000000000000000000‬  decimal -5505024
        c = -42;
        System.out.println((c <<= -15)      + " " + Integer.toBinaryString(c));       // result = 11111111101011000000000000000000

    }
}
