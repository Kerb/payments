package net.kerba.payments.api;
import java.util.List;
/**
 * Интерфейс, описывающий "Услугу".
 * Услуга содержит набор реквизитов, и ссылку на поставщика услуги.
 */
public interface PayableService {

    /**
     * @return список реквизитов услуги.
     */
    List<Requisite> getRequisites();
}
