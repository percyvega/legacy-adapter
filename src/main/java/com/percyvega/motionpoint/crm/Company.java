package com.percyvega.motionpoint.crm;

/**
 * Company encapsulates the abstraction of a MotionPoint corporate customer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public interface Company {

    /**
     * Reads the name of this Company.
     *
     * @return the name of this Company
     */
    String getName();

    /**
     * Updates the name of this Company.
     *
     * @param name name of this Company
     */
    void setName(String name);

    /**
     * Reads the number of employees of this Company.
     *
     * @return the number of employees of this Company
     */
    int getEmployeeCount();

    /**
     * Updates the number of employees of this Company.
     *
     * @param employeeCount the number of employees of this Company
     */
    void setEmployeeCount(int employeeCount);

    /**
     * Reads the phone number of this Company.
     *
     * @return the phone number of this Company
     */
    String getPhoneNumber();

    /**
     * Updates the phone number of this Company.
     *
     * @param phoneNumber the phone number of this Company
     */
    void setPhoneNumber(String phoneNumber);

    /**
     * Reads the website of this Company.
     *
     * @return the website of this Company
     */
    Website getWebsite();

    /**
     * Updates the the website of this Company.
     *
     * @param website the website of this Company
     */
    void setWebsite(Website website);
}
