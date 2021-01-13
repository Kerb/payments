package net.kerba.payments.api;

import java.math.BigDecimal;

/**
 * Интерфейс, описывающий тип данных "Сумма".
 * Содержит числовое значение суммы.
 */
public interface Amount {

    /**
     * @return значения в BigDecimal.
     */
    BigDecimal toBigDecimal();

}
