package main.java;

/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * 0xAAAAAAAA = 10101010101010101010101010101010
 * 0x55555555 = 1010101010101010101010101010101
 * for 0xAAAAAAAA, all even number is 1, and odd number is 0
 * for 0x55555555, all even number is 0, and odd number is 1
 * num & 0xAAAAAAAA can change all odd numbers to 0
 * num & 0x55555555 can change all even numbers to 0
 *
 *
 */

public class Main {
    public static void main(String[] args) {
    }
}
