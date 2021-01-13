package net.kerba.payments.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Входная точка для старта приложения.
 */
@SpringBootApplication(scanBasePackages = "net.kerba.payments.controller")
@SuppressWarnings({"HideUtilityClassConstructor"})
public class PaymentsApp {

    /**
     * Метод запускает приложение.
     * @param args аргументы
     */
    public static void main(final String[] args) {
        SpringApplication.run(PaymentsApp.class, args);
    }
}
