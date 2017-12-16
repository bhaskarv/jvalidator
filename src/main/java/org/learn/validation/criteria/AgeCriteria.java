package org.learn.validation.criteria;

/**
 * Created by vinay on 16/12/17.
 */
public class AgeCriteria implements Criteria {

    private int childAge;

    public AgeCriteria(int childAge) {
        this.childAge = childAge;
    }

    public int getChildAge() {
        return childAge;
    }

    public boolean evaluate() {
        return false;
    }
}

