package com.percyvega.motionpoint.legacycrm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LegacyCustomerUtil contains the utility functionality to support LegacyCustomer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public abstract class LegacyCustomerUtil {

    /**
     * Used to log lines and print them on the console.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LegacyCustomerUtil.class);

    /**
     * Used to specify the amount of indentation this class will use on some print lines.
     */
    public static final String INDENTATION = "\t\t";

    /**
     * Logs all properties of LegacyCustomer to help developers/operations
     * see the state of the object at any point in time.
     *
     * @param legacyCustomer the LegacyCustomer object to be displayed
     */
    public static void printLegacyCustomer(LegacyCustomer legacyCustomer) {
        LOGGER.debug("Legacy Customer information:");
        LOGGER.debug(INDENTATION + "Name: " + legacyCustomer.getName());
        LOGGER.debug(INDENTATION + "Number of Employees: " + legacyCustomer.getNumberOfEmployees());
        LOGGER.debug(INDENTATION + "Direct Number: " + legacyCustomer.getDirectNumber());
        LOGGER.debug(INDENTATION + "Description: " + legacyCustomer.getDomainDescription());
        LOGGER.debug(INDENTATION + "Domain URI: " + legacyCustomer.getDomainUri());
        LOGGER.debug(INDENTATION + "Original Language: " + legacyCustomer.getOriginalLanguage());
        LOGGER.debug(INDENTATION + "Translate to Language: " + legacyCustomer.getTranslateToLanguage());
    }

    /**
     * Connect to a legacy AS400 which only accepts a serialized
     * LegacyCustomer object and uses it to generate a monthly business report.
     *
     * <p>
     * Assume that at this point in time, only this class knows how to do all this.
     *
     * @param legacyCustomer the LegacyCustomer object to be sent to the AS400 for the monthly report
     */
    public static void sendLegacyCustomerToAS400forMonthlyReport(LegacyCustomer legacyCustomer) {
        // TODO
        // 1) Open connection to AS400
        // 2) Send LegacyCustomer as a serialized object
        // 3) Close connection to AS400
        LOGGER.debug("***********************************");
        LOGGER.debug("Customer '" + legacyCustomer.getName() + "' sent successfully to AS400");
        LOGGER.debug("***********************************");
    }

}
