package com.anju.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by huangliangliang on 1/31/17.
 */
@ConfigurationProperties(prefix="selfDefined")
public class SelfDefinedProperty {
    private String accessKey;
    private String secretKey;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
