package eelab.statemachine.demo;

public enum InvoiceStatus {

    /**
     * When items are just imported, but not checked
     */
    IMPORTED,
    /**
     * When all automatic check are OK
     */
    VALIDATED,
    /**
     * When calculation is done
     */
    EXECUTED,
    /**
     * When report is sent to the client
     */
    SENT_TO_CLIENT,
    /**
     * When invoice is sent to SAP
     */
    SENT_TO_SAP,
    /**
     * When SAP says yes
     */
    INVOICED_BY_SAP,
    /**
     * When SAP says that invoice is payed
     */
    PAYED

}
