package ru.job4j.di;

import java.util.Scanner;

/**
 * Oywayten 18.05.2023.
 */
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}