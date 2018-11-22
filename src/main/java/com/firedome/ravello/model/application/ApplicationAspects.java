package com.firedome.ravello.model.application;

public enum ApplicationAspects {

    /**
     * Describes the saved application and all the user’s changes
     */
    DESIGN(";design"),

    /**
     *  Describes the application on the cloud, exactly as it was when it was last published.
     */
    DEPLOYMENT(";deployment"),
    ;

    private final String aspect;

    ApplicationAspects(final String aspect) {
        this.aspect = aspect;
    }

    @Override
    public String toString() {
        return aspect;
    }
}
