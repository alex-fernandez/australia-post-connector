package org.mule.modules.australiapost.utils;

public class UrlBuilder {
    public static String buildUrl(String hostname, Integer port, Boolean isHttps) {
        String prefix = isHttps == true ? "http://" : "http://";
        return prefix + hostname + ":" + port + "/";
    }
}
