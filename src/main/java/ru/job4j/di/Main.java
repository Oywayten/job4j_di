package ru.job4j.di;

/**
 * Oywayten 18.05.2023.
 */
public class Main {
    public static final String WHAT_S_YOUR_NAME = "What's your name?";

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        String answer = ui.askString(WHAT_S_YOUR_NAME);
        ui.add(answer);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}