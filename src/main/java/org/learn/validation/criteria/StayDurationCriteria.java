package org.learn.validation.criteria;

/**
 * Created by vinay on 16/12/17.
 */
public class StayDurationCriteria implements Criteria {
    private int stayDuration;

    public StayDurationCriteria(int stayDuration) {
        this.stayDuration = stayDuration;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    @Override
    public boolean evaluate() {
        return false;
    }
}
