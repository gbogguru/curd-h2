package com.mycurd.demo.exception;

public class BusinessException extends RuntimeException {

    private String isInternalOrExternal;
    public BusinessException(String message, String isInternalOrExternal) {
        super(message);
        this.isInternalOrExternal = isInternalOrExternal;
    }
}
