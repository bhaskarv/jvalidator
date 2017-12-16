package org.learn.validation.rules;

/**
 * Created by vinay on 16/12/17.
 */
public class ValidationError {
    private int errorCode;
    private String message;

    public ValidationError(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ValidationError{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                '}';
    }
}
