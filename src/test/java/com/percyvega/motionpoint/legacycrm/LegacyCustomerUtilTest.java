package com.percyvega.motionpoint.legacycrm;

import com.percyvega.motionpoint.LegacyCustomerAdapter;
import com.percyvega.motionpoint.crm.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * LegacyCustomerUtilTest contains the unit tests that verify the functionality of LegacyCustomerUtil.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class LegacyCustomerUtilTest {

    private LegacyCustomer legacyCustomer;
    private Company company;

    /**
     * Prepares the Company and Website components needed for testing the methods of LegacyCustomer.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Before
    public void setUp() throws Exception {
        company = new CompanyImpl("Acme, Inc.");
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
     * Tests all the getters of LegacyCustomer.
     */
    @Test
    public void testGetters() {
        company.setName("United Nations");
        assertEquals(legacyCustomer.getName(), company.getName());
        legacyCustomer.setNumberOfEmployees(1234);
        assertEquals(legacyCustomer.getNumberOfEmployees(), company.getEmployeeCount());
        legacyCustomer.setDirectNumber("(123) 456-7890");
        assertEquals(legacyCustomer.getDirectNumber(), company.getPhoneNumber());
        legacyCustomer.setDomainDescription("UN recognized NGOs Portal");
        assertEquals(legacyCustomer.getDomainDescription(), company.getWebsite().getDescription());
        legacyCustomer.setDomainUri("http://ngo.un.org");
        assertEquals(legacyCustomer.getDomainUri(), company.getWebsite().getUrl());
        legacyCustomer.setOriginalLanguage(Language.ENGLISH.name());
        assertEquals(legacyCustomer.getOriginalLanguage(), company.getWebsite().getOriginalLanguage().name());
        legacyCustomer.setTranslateToLanguage(Language.FRENCH.name());
        assertEquals(legacyCustomer.getTranslateToLanguage(), company.getWebsite().getTranslateToLanguage().name());
    }

    /**
     * Tests all the setters of LegacyCustomer.
     */
    @Test
    public void testSetters() {
        assertEquals(legacyCustomer.getName(), company.getName());
        assertEquals(legacyCustomer.getNumberOfEmployees(), company.getEmployeeCount());
        assertEquals(legacyCustomer.getDirectNumber(), company.getPhoneNumber());
        assertEquals(legacyCustomer.getDomainDescription(), company.getWebsite().getDescription());
        assertEquals(legacyCustomer.getDomainUri(), company.getWebsite().getUrl());
        assertEquals(legacyCustomer.getOriginalLanguage(), company.getWebsite().getOriginalLanguage().name());
        assertEquals(legacyCustomer.getTranslateToLanguage(), company.getWebsite().getTranslateToLanguage().name());
    }

    /**
     * Tests all the getters of LegacyCustomer.
     */
    @Test
    public void testPrintLegacyClient() {
        LegacyCustomerUtil.printLegacyCustomer(legacyCustomer);
    }

    @Test
    public void testSendLegacyCustomerToAS400forEventualMonthlyReport() throws Exception {
        LegacyCustomerUtil.sendLegacyCustomerToAS400forMonthlyReport(legacyCustomer);
    }
}