package org.learn.validation.rules;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinay on 16/12/17.
 */
public final class CachedRules {
    public static final CachedRules INSTANCE = new CachedRules();

    public Map<String, Integer> getRules() {
        Map<String, Integer> rules = new HashMap<>();
        rules.put("STAY_DURATION", 10);
        rules.put("CHILD_AGE", 10);

        return rules;
    }
}