package ru.team3.Utils;

import java.util.Scanner;

public class ConsoleReader {

    public static String readFileName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
