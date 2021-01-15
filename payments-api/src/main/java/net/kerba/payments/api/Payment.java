package net.kerba.payments.api;

/**
 * Интерфейс, описывающий сущность "Платеж".
 */
public interface Payment {

    /**
     * @return Сумма платежа.
     */
    Amount getAmount();

    /**
     * @return Сумма комиссии.
     */
    Amount getCommission();

    /**
     * @return Финальная сумма платежа, включая комиссию.
     */
    Amount getFinalAmount();

}
