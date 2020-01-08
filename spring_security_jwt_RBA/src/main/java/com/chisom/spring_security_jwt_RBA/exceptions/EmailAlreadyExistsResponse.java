package com.chisom.spring_security_jwt_RBA.exceptions;

public class EmailAlreadyExistsResponse {

    private String email;

    public EmailAlreadyExistsResponse(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}