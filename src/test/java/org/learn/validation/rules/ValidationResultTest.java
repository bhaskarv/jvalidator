package org.learn.validation.rules;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vinay on 16/12/17.
 */
public class ValidationResultTest {

    private ValidationResult result;

    @Before
    public void setup() {
        result = new ValidationResult();
        result.setValid(false);
    }

    @Test
    public void testValidationResult() {
        assertTrue(!result.isValid());
        assertNull(result.getError());
    }
}