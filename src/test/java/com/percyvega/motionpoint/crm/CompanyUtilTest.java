package com.percyvega.motionpoint.crm;

import org.junit.Before;
import org.junit.Test;

/**
 * CompanyUtilTest contains the unit tests that verify the functionality of CompanyUtil.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class CompanyUtilTest {

    Company company;
    Website website;

    /**
     * Prepares the Company and Website components needed for testing CompanyUtil's methods.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Before
    public void setUp() throws Exception {
        company = new CompanyImpl("Acme, Inc.");
        company.setEmployeeCount(523);
        company.setPhoneNumber("987-012-3456");

        website = new WebsiteImpl("Acme's main company website");
        website.setUrl("http://www.acme.com");
        website.setOriginalLanguage(Language.ENGLISH);
        website.setTranslateToLanguage(Language.SPANISH);

        company.setWebsite(website);
    }

    /**
     * Tests that CompanyUtil's printWebsite prints correctly and fully the website object.
     *
     * @throws Exception when un unexpected exception occurs
     */
    @Test
    public void testPrintWebsite() throws Exception {
        CompanyUtil.printWebsite(website);
    }

    /**
     * Tests that CompanyUtil's printCompany prints correctly and fully the company object.
     *
     * @throws Exception when un unexpected exception occurs
     */
    @Test
    public void testPrintCompany() throws Exception {
        CompanyUtil.printCompany(company);
    }
}