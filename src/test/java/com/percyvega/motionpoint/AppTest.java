package com.percyvega.motionpoint;

import com.percyvega.motionpoint.crm.*;
import com.percyvega.motionpoint.legacycrm.LegacyCustomer;
import com.percyvega.motionpoint.legacycrm.LegacyCustomerUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * AppTest contains the unit tests that verify the main functionality of the project in general,
 * which is to be able to send successfully a LegacyCustomer object to an AS400 for a monthly report
 * using the archaic LegacyCustomerUtil, which only accepts as parameter a LegacyCustomer.
 * <p>
 * This is achieved by implementing the Adapter design pattern, which is a Structural GoF pattern to
 * convert the interface of a class into another interface clients expect.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class AppTest {

    private LegacyCustomer legacyCustomer;

    /**
     * Prepares the Company and Website components needed for testing LegacyCustomer's main method.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Before
    public void setUp() throws Exception {
        Company company = new CompanyImpl("Acme, Inc.");
        company.setEmployeeCount(523);
        company.setPhoneNumber("987-012-3456");

        Website website = new WebsiteImpl("Acme's main company website");
        website.setUrl("http://www.acme.com");
        website.setOriginalLanguage(Language.ENGLISH);
        website.setTranslateToLanguage(Language.SPANISH);

        company.setWebsite(website);

        legacyCustomer = new LegacyCustomerAdapter(company);
    }

    /**
     * Tests LegacyCustomer's main method.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Test
    public void sendLegacyCustomerTest() throws Exception {
        LegacyCustomerUtil.sendLegacyCustomerToAS400forMonthlyReport(legacyCustomer);
    }

}