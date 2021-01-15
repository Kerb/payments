package net.kerba.payments.api;

import java.util.Optional;

/**
 * Интерфейс, описывающий "Персону".
 */
public interface Person {

    /**
     * @return имя персоны.
     */
    Optional<String> getFirstName();

    /**
     * @return фамилия персоны.
     */
    Optional<String> getLastName();

    /**
     * @return отчество персоны.
     */
    Optional<String> getMiddleName();
}
