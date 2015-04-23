package com.percyvega.motionpoint.crm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CompanyUtil contains the utility functionality to support Company (and Website).
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public abstract class CompanyUtil {

    /**
     * Used to log lines and print them on the console.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyUtil.class);

    /**
     * Used to specify the amount of indentation this class will use on some print lines.
     */
    public static final String INDENTATION = "\t\t";

    /**
     * Logs all properties of Website (except Company) to help
     * developers/operations see the state of the object at any point in time.
     *
     * @param website the Website object to be displayed
     */
    public static void printWebsite(Website website) {
        LOGGER.debug("Website information:");
        LOGGER.debug(INDENTATION + "URL: " + website.getUrl());
        LOGGER.debug(INDENTATION + "Original Language: " + website.getOriginalLanguage());
        LOGGER.debug(INDENTATION + "Translate to Language: " + website.getTranslateToLanguage());
    }

    /**
     * Logs all properties of Company to help developers/operations
     * see the state of the object at any point in time.
     *
     * @param company the Company object to be displayed
     */
    public static void printCompany(Company company) {
        LOGGER.debug("Company information:");
        LOGGER.debug(INDENTATION + "Name: " + company.getName());
        LOGGER.debug(INDENTATION + "Employee Count: " + company.getEmployeeCount());
        LOGGER.debug(INDENTATION + "Phone Number: " + company.getPhoneNumber());
        LOGGER.debug(INDENTATION + "Website: " + company.getWebsite());
    }
}
