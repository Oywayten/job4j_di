package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Oywayten 18.05.2023.
 */
@Component
@Scope("prototype")
public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    @Autowired
    public void setConsoleInput(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public String askString(String question) {
        question = String.format("%s%s", question, System.lineSeparator());
        return consoleInput.askStr(question);
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}