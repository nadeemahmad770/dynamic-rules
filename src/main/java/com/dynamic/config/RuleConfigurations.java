package com.dynamic.config;

import com.dynamic.config.model.Rule;
import com.dynamic.config.rules.Rule1;
import com.dynamic.config.rules.Rule2;
import com.dynamic.config.rules.Rule3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleConfigurations {

    @Bean
    @ConditionalOnProperty(name = "rules.rule1.enabled", havingValue = "true")
    public Rule rule1() {
        return new Rule1();
    }

    @Bean
    @ConditionalOnProperty(name = "rules.rule2.enabled", havingValue = "true")
    public Rule rule2() {
        return new Rule2();
    }

    @Bean
    @ConditionalOnProperty(name = "rules.rule3.enabled", havingValue = "true")
    public Rule rule3() {
        return new Rule3();
    }
}