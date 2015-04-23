package com.percyvega.motionpoint.crm;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * ValidCompanyPhoneNumberTest contains the unit tests that
 * verify the functionality of Company's setPhoneNumber
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
@RunWith(Parameterized.class)
public class ValidCompanyPhoneNumberTest {

    private Company company;
    private String phoneNumber;

    /**
     * Prepares the Company component needed for testing that valid phone numbers will be accepted.
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
                "987-654-3210",
                "(987) 654-3210",
                "(987)6543210",
                "9876543210"
        };
    }

    public ValidCompanyPhoneNumberTest(String phoneNumber) throws Exception {
        this.phoneNumber = phoneNumber;
    }

    @Test
    public void test() throws Exception {
        company.setPhoneNumber(this.phoneNumber);
    }

}