package org.learn.validation.rules;

import org.learn.validation.criteria.AgeCriteria;
import org.learn.validation.criteria.Criteria;

/**
 * Created by vinay on 16/12/17.
 */
public class ChildAgeValidationRule extends ValidationRule<Criteria> {

    public ChildAgeValidationRule(Criteria criteria) {
        super(criteria);
    }

    @Override
    public ValidationResult validate() {
        int maxChildAgeAllowed = getCachedRules().get("CHILD_AGE");
        int inputAge = ((AgeCriteria) getInputCriteria()).getChildAge();
        ValidationResult result = new ValidationResult();
        result.setValid(inputAge <= maxChildAgeAllowed);
        if (!result.isValid()) {
            result.setError(new ValidationError(100,
                    String.format("Child age specified in request  %s is greater than allowed child age %s",
                                    inputAge, maxChildAgeAllowed)));
        }
        return result;
    }
}