package com.example.gcsactions;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    void main_shouldPrintHelloAndSum() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try {
            Main.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String out = baos.toString();
        assertTrue(out.contains("Hello, GitHub Actions!"));
        assertTrue(out.contains("2 + 2 = 4"));
    }
}
