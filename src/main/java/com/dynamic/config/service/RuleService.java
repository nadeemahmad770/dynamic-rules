package com.dynamic.config.service;

import com.dynamic.config.model.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleService {

    private final List<Rule> rules;

    @Autowired
    public RuleService(List<Rule> rules) {
        this.rules = rules;
    }

    public void applyRules() {
        for (Rule rule : rules) {
            rule.apply();
        }
    }
}