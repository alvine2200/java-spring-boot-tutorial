package com.Spring.crud.error;

public class SuccessHandler extends RuntimeException{
    public SuccessHandler() {
        super();
    }

    public SuccessHandler(String message) {
        super(message);
    }

    public SuccessHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public SuccessHandler(Throwable cause) {
        super(cause);
    }

    protected SuccessHandler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
