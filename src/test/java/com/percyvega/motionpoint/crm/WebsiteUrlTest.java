package com.percyvega.motionpoint.crm;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

/**
 * WebsiteUrlTest contains the unit tests that verify the functionality of Website's setUrl.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class WebsiteUrlTest {

    private Website website;
    private String url;

    /**
     * Prepares the Website component needed for testing that valid and invalid URLs will be identified.
     *
     * @throws Exception when an unexpected error occurs
     */
    @Before
    public void setUp() throws Exception {
        website = new WebsiteImpl("Acme's main company website");
    }

    @Test
    public void validWebsiteUrlTest() throws Exception {
        String aUrl = new String("http://www.acme.com");

        url = new String(aUrl);
        website.setUrl(url);

        assertEquals(website.getUrl(), aUrl);
    }

    @Test(expected = InvalidParameterException.class)
    public void invalidWebsiteUrlTest() throws Exception {
        String aUrl = new String("http://www .acme.com");

        url = new String(aUrl);
        website.setUrl(url);
    }

}