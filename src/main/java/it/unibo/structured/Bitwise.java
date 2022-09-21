package it.unibo.structured;

public class Bitwise {
    public static void main(String[] args){
        // byte b = 128; // error: incompasible types: possible loss of conversion from int to byte
        byte b = (byte) 128; // -128 (2C => 1000 0000)
        System.out.println(b >> 1); // -64 (2C => [111111...] 1100 0000)
        // Caveat: gli operandi dello shift vengono promossi al tipo int
        System.out.println(b >>> 1); // 2147483584 (2C => [011111...] 1100 0000)
        System.out.println(Integer.toBinaryString(b >>> 2)); // 00 11111111111111111111 1111 1110 0000
        System.out.println(Integer.toBinaryString(b >> 2));  // 11 11111111111111111111 1111 1110 0000
    }
}