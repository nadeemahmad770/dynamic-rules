package com.dynamic.config.rules;

import com.dynamic.config.model.Rule;

public class Rule1 implements Rule {
    @Override
    public void apply() {
        // Logic for rule 1
        System.out.println("Applying Rule 1");
    }
}