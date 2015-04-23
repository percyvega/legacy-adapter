package com.percyvega.motionpoint.crm;

import java.security.InvalidParameterException;
import java.util.regex.Pattern;

/**
 * WebsiteImpl encapsulates the implementation of the website of a MotionPoint corporate customer.
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
public class WebsiteImpl implements Website {

    /**
     * The regular expression pattern for URL.
     */
    private static final Pattern URL_PATTERN = Pattern.compile("^https?://[^\\s/$.?#].[^\\s]*$");

    /**
     * To store the description of the website.
     */
    private String description;
    /**
     * To store the URL of the website.
     */
    private String url;
    /**
     * To store the initial language of the website.
     */
    private Language originalLanguage;
    /**
     * To store the language you want to translate the website.
     */
    private Language translateToLanguage;

    /**
     * Constructor that makes the description of the Website mandatory.
     *
     * @param description the description that informs what this website is about
     */
    public WebsiteImpl(String description) {
        this.description = description;
    }

    @Override
    public final String getDescription() {
        return description;
    }

    @Override
    public final void setDescription(String description) {
        this.description = description;
    }

    @Override
    public final String getUrl() {
        return url;
    }

    /**
     * This not only sets the URL, but also validates it against the URL_PATTERN.
     *
     * @throws InvalidParameterException if URL does not comply with URL_PATTERN
     * @param url the URL of this Website
     */
    @Override
    public final void setUrl(String url) throws InvalidParameterException {
        if (URL_PATTERN.matcher(url).matches()) {
            this.url = url;
        } else {
            throw new InvalidParameterException(url);
        }
    }

    @Override
    public final Language getOriginalLanguage() {
        return originalLanguage;
    }

    @Override
    public final void setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    @Override
    public final Language getTranslateToLanguage() {
        return translateToLanguage;
    }

    @Override
    public final void setTranslateToLanguage(Language translateToLanguage) {
        this.translateToLanguage = translateToLanguage;
    }

}
