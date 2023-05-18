package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Oywayten 18.05.2023.
 */
@Component
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}