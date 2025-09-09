package com.dawull;

import com.dawull.standard.util.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTest {
    public static String run(String input) {
        input.stripIndent().trim();
        Scanner scanner = TestUtil.genScanner(input);
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        App app = new App(scanner);
        app.run();

        String output = outputStream.toString();

        TestUtil.clearSetOutToByteArray(outputStream);
        return output;
    }


}
