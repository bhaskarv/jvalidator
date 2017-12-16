package org.learn.validation.validator;

import org.learn.validation.criteria.AgeCriteria;
import org.learn.validation.criteria.StayDurationCriteria;
import org.learn.validation.rules.ChildAgeValidationRule;
import org.learn.validation.rules.StayDurationValidationRule;
import org.learn.validation.rules.ValidationResult;
import org.learn.validation.rules.ValidationRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinay on 16/12/17.
 */
public class RateInfoValidator {
    //Prepare Rules to be fired based on Request object supplied
    //Execute the rules and gather results
    public static void main(String[] args) {
        RatesRequest request = new RatesRequest(11, 10);
        List<ValidationRule> rules = prepareRules(request);
        for(ValidationRule rule : rules) {
            ValidationResult result = rule.validate();
            if (!result.isValid()) {
                System.out.println(result.getError());
            }
        }
    }

    public static List<ValidationRule> prepareRules(RatesRequest request) {
        List<ValidationRule> rules = new ArrayList<>(2);
        if (request.getChildAge() > 0) {
            rules.add(new ChildAgeValidationRule(new AgeCriteria(request.getChildAge())));
        }

        if (request.getStayDuration() > 0) {
            rules.add(new StayDurationValidationRule(new StayDurationCriteria(request.getStayDuration())));
        }
        return rules;
    }
}
