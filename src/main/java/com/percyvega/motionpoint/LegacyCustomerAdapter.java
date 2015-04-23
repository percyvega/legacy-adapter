package com.percyvega.motionpoint;

import com.percyvega.motionpoint.crm.Company;
import com.percyvega.motionpoint.crm.Language;
import com.percyvega.motionpoint.legacycrm.LegacyCustomer;

/**
 * LegacyCustomerAdapter implements the Adapter Design Pattern to provide the
 * bridge between the CRM implementations and the Legacy CRM implementations.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class LegacyCustomerAdapter implements LegacyCustomer {

    /**
     * Company is used to store the Company object from which we'll obtain the values.
     */
    private Company company;

    /**
     * Constructor that requires a Company object to read from its values.
     *
     * @param company Company object that will be used by the Adapter to read from its values
     */
    public LegacyCustomerAdapter(Company company) {
        this.company = company;
    }

    @Override
    public final String getName() {
        return company.getName();
    }

    @Override
    public final void setName(String name) {
        company.setName(name);
    }

    @Override
    public final int getNumberOfEmployees() {
        return company.getEmployeeCount();
    }

    @Override
    public final void setNumberOfEmployees(int numberOfEmployees) {
        company.setEmployeeCount(numberOfEmployees);
    }

    @Override
    public final String getDirectNumber() {
        return company.getPhoneNumber();
    }

    @Override
    public final void setDirectNumber(String directNumber) {
        company.setPhoneNumber(directNumber);
    }

    @Override
    public final String getDomainDescription() {
        return company.getWebsite().getDescription();
    }

    @Override
    public final void setDomainDescription(String domainDescription) {
        company.getWebsite().setDescription(domainDescription);
    }

    @Override
    public final String getDomainUri() {
        return company.getWebsite().getUrl();
    }

    @Override
    public final void setDomainUri(String domainUri) {
        company.getWebsite().setUrl(domainUri);
    }

    @Override
    public final String getOriginalLanguage() {
        return company.getWebsite().getOriginalLanguage().toString();
    }

    @Override
    public final void setOriginalLanguage(String originalLanguage) {
        company.getWebsite().setOriginalLanguage(Language.valueOf(originalLanguage));
    }

    @Override
    public final String getTranslateToLanguage() {
        return company.getWebsite().getTranslateToLanguage().toString();
    }

    @Override
    public final void setTranslateToLanguage(String translateToLanguage) {
        company.getWebsite().setTranslateToLanguage(Language.valueOf(translateToLanguage));
    }

}
