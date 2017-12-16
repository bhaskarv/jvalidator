package org.learn.validation.rules;

import org.learn.validation.criteria.Criteria;

import java.util.Map;

/**
 * Created by vinay on 16/12/17.
 */
public abstract class ValidationRule<T extends Criteria> {

    private T inputCriteria;

    public ValidationRule(T criteria) {
        this.inputCriteria = criteria;
    }

    protected T getInputCriteria() {
        return inputCriteria;
    }

    protected Map<String, Integer> getCachedRules() {
        return CachedRules.INSTANCE.getRules();
    }

    public abstract ValidationResult validate();
}