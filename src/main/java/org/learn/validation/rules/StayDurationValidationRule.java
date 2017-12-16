package org.learn.validation.rules;

import org.learn.validation.criteria.Criteria;
import org.learn.validation.criteria.StayDurationCriteria;

/**
 * Created by vinay on 16/12/17.
 */
public class StayDurationValidationRule extends ValidationRule<Criteria> {

    public StayDurationValidationRule(Criteria criteria) {
        super(criteria);
    }

    @Override
    public ValidationResult validate() {
        int stayDuration = getCachedRules().get("STAY_DURATION");
        boolean isValid = (stayDuration >= ((StayDurationCriteria) getInputCriteria()).getStayDuration());
        ValidationResult result = new ValidationResult();
        result.setValid(isValid);
        if (!isValid) {
            result.setError(new ValidationError(101,
                           "Stay duration specified in the request is greater than maximum allowed stay duration"));
        }
        return result;
    }
}