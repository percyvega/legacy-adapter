package com.percyvega.motionpoint.crm;

import java.security.InvalidParameterException;
import java.util.regex.Pattern;

/**
 * CompanyImpl encapsulates the implementation of a MotionPoint corporate customer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class CompanyImpl implements Company {

    /**
     * The regular expression pattern for phone number.
     */
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^(\\(\\d{3}\\)|\\d{3})[- ]?\\d{3}[- ]?\\d{4}$");

    /**
     * To store the name of this Company.
     */
    private String name;

    /**
     * To store the number of employees of this Company.
     */
    private int employeeCount;

    /**
     * To store the phone number of this Company.
     */
    private String phoneNumber;

    /**
     * To store the website of this Company.
     */
    private Website website;

    /**
     * Constructor that makes the name of the Company mandatory.
     *
     * @param name the name that identifies this Company
     */
    public CompanyImpl(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public final void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public final String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This not only sets the phone number, but also validates it against the PHONE_NUMBER_PATTERN.
     *
     * @throws InvalidParameterException if phone number does not comply with PHONE_NUMBER_PATTERN
     * @param phoneNumber the phone number of this Company
     */
    @Override
    public final void setPhoneNumber(String phoneNumber) throws InvalidParameterException {
        if (PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches()) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new InvalidParameterException(phoneNumber);
        }
    }

    @Override
    public final Website getWebsite() {
        return website;
    }

    @Override
    public final void setWebsite(Website website) {
        this.website = website;
    }

}
