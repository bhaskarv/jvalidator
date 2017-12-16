package org.learn.validation.rules;

/**
 * Created by vinay on 16/12/17.
 */
public class ValidationResult {
    private boolean valid;
    private ValidationError error;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public ValidationError getError() {
        return error;
    }

    public void setError(ValidationError error) {
        this.error = error;
    }
}
