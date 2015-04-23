package com.percyvega.motionpoint.crm;

/**
 * Website encapsulates the abstraction of the website of a MotionPoint corporate customer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public interface Website {

    /**
     * Reads the  of this Website.
     *
     * @return the description of this Website
     */
    String getDescription();

    /**
     * Updates the description of this Website.
     *
     * @param description the description of this Website
     */
    void setDescription(String description);

    /**
     * Reads the URL of this Website.
     *
     * @return the URL of this Website
     */
    String getUrl();

    /**
     * Updates the URL of this Website.
     *
     * @param url the URL of this Website
     */
    void setUrl(String url);

    /**
     * Reads the original Language of this Website.
     *
     * @return the original Language of this Website
     */
    Language getOriginalLanguage();

    /**
     * Updates the original Language of this Website.
     *
     * @param originalLanguage the original Language of this Website
     */
    void setOriginalLanguage(Language originalLanguage);

    /**
     * Reads the Language of this Website that is to be translated to.
     *
     * @return the Language of this Website that is to be translated to
     */
    Language getTranslateToLanguage();

    /**
     * Updates the Language of this Website that is to be translated to.
     *
     * @param translateToLanguage the Language of this Website that is to be translated to
     */
    void setTranslateToLanguage(Language translateToLanguage);
}
