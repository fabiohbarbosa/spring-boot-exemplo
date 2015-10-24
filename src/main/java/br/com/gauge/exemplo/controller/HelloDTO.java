package br.com.gauge.exemplo.controller;

/**
 * Hello DTO
 * Created by fabio on 24/10/15.
 */
public class HelloDTO {
    private String message;

    public HelloDTO() {
    }

    public HelloDTO(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }


}