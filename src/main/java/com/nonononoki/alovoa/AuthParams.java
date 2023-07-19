package com.nonononoki.alovoa;

import com.nonononoki.alovoa.config.SecurityConfig;

public class AuthParams {
    private SecurityConfig securityConfig;
    private String httpSessionId;
    private String username;
    private String firstName;
    private int page;
    private String password;

    //constructor
    public AuthParams(SecurityConfig securityConfig, String httpSessionId, String username, String firstName, int page, String password) {
        this.securityConfig = securityConfig;
        this.httpSessionId = httpSessionId;
        this.username = username;
        this.firstName = firstName;
        this.page = page;
        this.password = password;
    }

    public AuthParams(SecurityConfig securityConfig, String httpSessionId, String username,
                      String firstName, int page) {
        this.securityConfig = securityConfig;
        this.httpSessionId = httpSessionId;
        this.username = username;
        this.firstName = firstName;
        this.page = page;
    }

    public SecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    public void setSecurityConfig(SecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    public String getHttpSessionId() {
        return httpSessionId;
    }

    public void setHttpSessionId(String httpSessionId) {
        this.httpSessionId = httpSessionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
