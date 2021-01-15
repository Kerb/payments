package net.kerba.payments.api;

import java.util.List;

/**
 * Интерфейс, описывающий "Поставщика".
 */
public interface ServiceProvider {

    /**
     * @return список услуг поставщика.
     */
    List<PayableService> getServices();
}
