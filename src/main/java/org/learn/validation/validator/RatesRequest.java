package org.learn.validation.validator;

/**
 * Created by vinay on 16/12/17.
 */
public class RatesRequest {

    private int childAge;
    private int stayDuration;

    public RatesRequest(int childAge, int stayDuration) {
        this.childAge = childAge;
        this.stayDuration = stayDuration;
    }

    public int getChildAge() {
        return childAge;
    }

    public int getStayDuration() {
        return stayDuration;
    }
}
