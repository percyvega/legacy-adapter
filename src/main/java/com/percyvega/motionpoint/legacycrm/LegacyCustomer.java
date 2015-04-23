package com.percyvega.motionpoint.legacycrm;

import java.io.Serializable;

/**
 * LegacyCustomer is the legacy encapsulation of the abstraction of a MotionPoint customer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public interface LegacyCustomer extends Serializable {

    /**
     * Reads the name of this Customer.
     *
     * @return the name of this Customer
     */
    String getName();

    /**
     * Updates the name of this Customer.
     *
     * @param name the name of this Customer
     */
    void setName(String name);

    /**
     * Reads the number of employees of this Customer.
     *
     * @return the number of employees of this Customer
     */
    int getNumberOfEmployees();

    /**
     * Updates the number of employees of this Customer.
     *
     * @param numberOfEmployees number of employees of this Customer
     */
    void setNumberOfEmployees(int numberOfEmployees);

    /**
     * Reads the phone number of this Customer.
     *
     * @return the phone number of this Customer
     */
    String getDirectNumber();

    /**
     * Updates the phone number of this Customer.
     *
     * @param directNumber the phone number of this Customer
     */
    void setDirectNumber(String directNumber);

    /**
     * Reads the description of this Customer Website.
     *
     * @return the description of the Customer Website
     */
    String getDomainDescription();

    /**
     * Updates the description of the Customer Website.
     *
     * @param domainDescription the description of the Customer Website
     */
    void setDomainDescription(String domainDescription);

    /**
     * Reads the URI of this Customer Website.
     *
     * @return the URI of the Customer Website
     */
    String getDomainUri();

    /**
     * Updates the URI of the Customer Website.
     *
     * @param domainUri the URI of the Customer Website
     */
    void setDomainUri(String domainUri);

    /**
     * Reads the original language of this Customer Website.
     *
     * @return the original language of the Customer Website
     */
    String getOriginalLanguage();

    /**
     * Updates the original language of the Customer Website.
     *
     * @param originalLanguage the original language of the Customer Website
     */
    void setOriginalLanguage(String originalLanguage);

    /**
     * Reads the language the Customer Website is to be translated to.
     *
     * @return the language the Customer Website is to be translated to
     */
    String getTranslateToLanguage();

    /**
     * Updates the language the Customer Website is to be translated to.
     *
     * @param translateToLanguage the language the Customer Website is to be translated to
     */
    void setTranslateToLanguage(String translateToLanguage);
}
