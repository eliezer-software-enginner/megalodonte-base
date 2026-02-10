package megalodonte.application;

import javafx.application.Application;

import java.util.function.Consumer;

public final class MegalodonteApp {

    public static void run(Consumer<Context> contextHandler) {
        Bootstrap.handler = contextHandler;
        Application.launch(JavaFXHost.class);
    }

    public static void run(String[] args, Consumer<Context> contextHandler) {
        Bootstrap.handler = contextHandler;
        Application.launch(JavaFXHost.class, args);
    }
}
