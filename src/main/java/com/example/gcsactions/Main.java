package com.example.gcsactions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, GitHub Actions!");
        Calculator c = new Calculator();
        System.out.println("2 + 2 = " + c.add(2, 2));
    }
}
