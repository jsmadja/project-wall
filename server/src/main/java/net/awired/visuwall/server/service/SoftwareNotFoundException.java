package net.awired.visuwall.server.service;

public class SoftwareNotFoundException extends Exception {

    private static final long serialVersionUID = 3207668047126605653L;

    public SoftwareNotFoundException(String cause) {
        super(cause);
    }

}
