package com.dynamic.config.controller;

import com.dynamic.config.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {

    private final RuleService ruleService;

    @Autowired
    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @GetMapping("/apply-rules")
    public String applyRules() {
        ruleService.applyRules();
        return "Rules applied successfully!";
    }
}