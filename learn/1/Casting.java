public class Casting {
    public static void main(String[] args) {
        double floatNum = 200.5;
        int num = (int)floatNum;
        System.out.println("num: " + num);

        char c = 'a';
        int ic = (int)c;
        System.out.println("ic: " + ic);

        byte b = 10;
        int i = b + b; // byte + byte = int, expression is evaluated to int

        byte b2 = (byte)i;
        System.out.println("b2: " + b2);

        char c1 = 'a';
        char c2 = (char)(c1 + 3);
        int ic2 = c1 + c2;  // char + char = int, expression is evaluated to int
        char c3 = (char)ic2;    // int = char, int is casted to char
        System.out.println("c3: " + c3);
        
        char charA = 'A';
        char charB = 'B';
        char CharSum = (char)(charA + charB);
        int intSum = charA + charB;
        System.out.println("intSum: " + intSum);
        System.out.println("CharSum: " + CharSum);
        
        System.out.println();
        System.out.println("loop: ");
        for(int i2 = 0; i2 < 5; i2++) {
            System.out.println("int: " + i2/3);
            System.out.println("double: " + (double)i2/3);
            System.out.println();
        }


    }
}

// automatic type conversion in java:
// 1. byte -> short -> int -> long -> float -> double
// 2. char -> int
// type without automatic conversion:
// 1. boolean

// spacing and parentheses: increase the precedence of the operations, and makes the code more readable
// x = y/3-34*temp+127;
// x = (y/3) - (34*temp) + 127;

