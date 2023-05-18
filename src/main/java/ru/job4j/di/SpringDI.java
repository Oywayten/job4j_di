package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static ru.job4j.di.Main.WHAT_S_YOUR_NAME;

/**
 * Oywayten 18.05.2023.
 */
public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        String answer = ui.askString(WHAT_S_YOUR_NAME);
        ui.add(answer);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}