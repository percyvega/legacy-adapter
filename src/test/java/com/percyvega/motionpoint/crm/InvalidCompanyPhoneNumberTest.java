package com.percyvega.motionpoint.crm;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.security.InvalidParameterException;

/**
 * InvalidCompanyPhoneNumberTest contains the negative unit tests that
 * verify the functionality of Company's setPhoneNumber
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
@RunWith(Parameterized.class)
public class InvalidCompanyPhoneNumberTest {

    private Company company;
    private String phoneNumber;

    /**
     * Prepares the Company component needed for testing that invalid phone numbers will be identified.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Before
    public void setUp() throws Exception {
        company = new CompanyImpl("Acme");
    }

    @Parameterized.Parameters
    public static String[] phoneNumbers() {
        return new String[]{
                "987)654-3210",
                "98765-43210",
                "98765210",
                "9876a43210"
        };
    }

    public InvalidCompanyPhoneNumberTest(String phoneNumber) throws Exception {
        this.phoneNumber = phoneNumber;
    }

    @Test(expected = InvalidParameterException.class)
    public void test() throws Exception {
        company.setPhoneNumber(this.phoneNumber);
    }

}